var articleContent = angular.module('article.content',[])

.controller('articleCtr', function($scope){

     $scope.articleNum = '1' //ze sciezki
     $scope.articleTitle = getArticleTitle();
     $scope.articleContent = getArticleContent();


     function getArticleTitle(){
        return;
     }

     function getArticleContent(){
        return;
     }


});