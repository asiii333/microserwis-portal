var articleContent = angular.module('article.content',[])

.controller('articleContentCtr', function($scope, $stateParams, $http){

     $scope.articleNum = $stateParams.artNum; //ze sciezki
     getArticleTitle();
     getArticleContent();



     function getArticleTitle(){
        console.log('get article title');
         $http.get('http://localhost:2223/title/' + $scope.articleNum).
                then(function(response) {
                   $scope.articleTitle =  response.data;
                   console.log(response.data);
                });
     }

     function getArticleContent(){
             console.log('get article content');
              $http.get('http://localhost:2221/article/' + $scope.articleNum).
                     then(function(response) {
                        $scope.articleContent =   response.data;
                        console.log(response.data);
                     });

     }

});