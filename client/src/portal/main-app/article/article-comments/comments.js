var articleComments = angular.module('article.comments',[])

.controller('commentsCtr', function($scope,$stateParams, $http){

    var articleNum =  $stateParams.artNum;  //ze sciezki
    $scope.articleNum = articleNum;
    $scope.newComment = {artNumber: articleNum};
    var pageNum = 1;

    getAllComents();

     $scope.addComent = function addComent(){
        console.log("add comments");
                     console.log('add comments to article');
                     console.log('data:' +  $scope.newComment);
                     var path = $scope.commentsServisAdress + '/comments/'+ articleNum + '/add';
                      $http.post(path, $scope.newComment).
                             then(function(response) {
                                $scope.articleContent =   response.data;
                                console.log(response.data);
                                getAllComents();
                                clearForm();
                             });
     }

     function getAllComents(){
        console.log("add comments");
                     console.log('get comments');
                     var path = $scope.commentsServisAdress + '/comments/' + articleNum + '/' + pageNum;

                      $http.get(path ).
                             then(function(response) {
                                $scope.allComents =   response.data;
                                console.log(response.data);
                             });
     }

    function clearForm(){
          $scope.newComment.name = '';
          $scope.newComment.content = '';

    }
});