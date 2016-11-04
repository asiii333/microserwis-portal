var app = angular.module('mainApp', [
    'ui.router',
    'mainPage',
    'category',
    'article'
    ]);

app.config(function($stateProvider, $urlRouterProvider) {

    $urlRouterProvider.otherwise('/main');

    $stateProvider

        .state('about', {
            url: '/about',
            templateUrl: 'footer/about/about.html'
        })
        .state('help', {
            url: '/help',
            templateUrl: 'footer/help/help.html'
        });


});