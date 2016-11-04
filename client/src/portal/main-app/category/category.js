var category = angular.module('category', [
    'category.poland',
    'category.world',
    'category.magazine',
    'category.economy',
    'category.all'
    ]);

category.config(function($stateProvider, $urlRouterProvider) {

    $urlRouterProvider.otherwise('/main');

    $stateProvider

        .state('poland', {
                    url: '/poland',
                    templateUrl: 'category/poland/poland.html'
                 })
        .state('world', {
                    url: '/world',
                    templateUrl: 'category/world/world.html'
                 })
        .state('magazine', {
                    url: '/magazine',
                    templateUrl: 'category/magazine/magazine.html'
                })
        .state('economy', {
                    url: '/economy',
                    templateUrl: 'category/economy/economy.html'
                })
        .state('all', {
                    url: '/all',
                    templateUrl: 'category/all/all-article.html'
                });


});