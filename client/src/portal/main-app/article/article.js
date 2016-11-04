var article = angular.module('article',[
    'article.comments',
    'article.content',
    'article.recomended']);

article.config(function($stateProvider, $urlRouterProvider) {

      $stateProvider
            .state('article', {
                url: '/article/:artNum',
                 views:{
                    '': {
                        templateUrl: 'article/article.html'
                    },
                    'content@article': {
                        templateUrl: 'article/article-content/content.html'
                    },
                    'comments@article': {
                        templateUrl: 'article/article-comments/comments.html'
                    },
                    'recomended@article': {
                        templateUrl: 'article/article-recomended/recomended.html'
                        }
                }
            });
    });

article.controller('articleCtr', function($scope){

     $scope.content = "all article example";
});