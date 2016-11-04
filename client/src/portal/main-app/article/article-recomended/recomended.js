var articleRecomended = angular.module('article.recomended',[])

.controller('articleCtr', function($scope){


     $scope.lastArticle = getLastArticle();
     $scope.similarArticle = getSimilarArticle();


     function getLastArticle(){
        return;
     }

     function getSimilarArticle(){
        return;
     }

});