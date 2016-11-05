var category = angular.module('category', [
    'category.all',
    'category.articleList'
    ]);

category.config(function($stateProvider, $urlRouterProvider) {

    $urlRouterProvider.otherwise('/main');

    $stateProvider

        .state('category', {
                    url: '/category/:categoryName',
                    templateUrl: 'category/category/article-list.html'
                 })
        .state('all', {
                    url: '/all',
                    templateUrl: 'category/all/all-article.html'
                });


});