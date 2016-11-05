var app = angular.module('mainApp', [
    'ui.router',
    'mainPage',
    'category',
    'article'
    ]);

app.controller('appCtr', function($scope){

    $scope.commentsServisAdress = 'http://localhost:2222';
    $scope.articleServisAdress = 'http://localhost:2221';
    $scope.titleServisAdress = 'http://localhost:2223';

});
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