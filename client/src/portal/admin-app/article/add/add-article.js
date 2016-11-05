var articleComments = angular.module('article.add',[])

.controller('addArticle', function($scope,$stateParams, $http){

    $scope.newArticleContent = {};
    $scope.newArticleTitle = {};

    $scope.saveArticle = function(){

        saveArticleContent();
        clearForm();
    }

   function saveArticleContent(){
   console.log( $scope.newArticleTitle);
        console.log("add article");
                     var path = $scope.articleServisAdress + '/article/add';
                     var tempArticleTitle =  $scope.newArticleTitle;
                      $http.post(path, $scope.newArticleContent).
                             then(function(response) {
                             console.log( tempArticleTitle);
                                $scope.article =  response.data;
                                saveArticleTitle(tempArticleTitle, response.data.number)
                             });
    }


    function saveArticleTitle(artTitle, artNumber){
        console.log("add article title " + artNumber);
                     var path = $scope.titleServisAdress + '/title/add';
                      artTitle['artNumber'] = artNumber;
                      $http.post(path,artTitle).
                             then(function(response) {
                                $scope.articleTitle =  response.data;
                                console.log(response.data);
                                clearForm();
                             });
    }

    function clearForm(){
          $scope.newArticleContent = {};
          $scope.newArticleTitle = {};

    }
});