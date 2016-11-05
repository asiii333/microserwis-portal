var app = angular.module('mainApp', [
    'ui.router',
    'article.add'
    ]);

app.controller('appCtr', function($scope){

    $scope.articleServisAdress = 'http://localhost:2221';
    $scope.titleServisAdress = 'http://localhost:2223';


});
app.config(function($stateProvider, $urlRouterProvider) {

    $urlRouterProvider.otherwise('/articleadd');

    $stateProvider
        .state('articleadd', {
            url: '/article/add',
            templateUrl: 'article/add/add-article.html'
        });


});