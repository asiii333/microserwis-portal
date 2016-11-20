var app = angular.module('adminApp', [
    'ui.router',
    'article.add'
    ]);

app.controller('adminCtr', function($scope){

    $scope.articleServisAdress = 'http://localhost:2221';
    $scope.titleServisAdress = 'http://localhost:2223';


});
app.config(function($stateProvider, $urlRouterProvider) {

    $urlRouterProvider.otherwise('/articleadd');

    $stateProvider
        .state('articleadd', {
            url: '/articleadd',
            templateUrl: 'article/add/add-article.html'
        });


});