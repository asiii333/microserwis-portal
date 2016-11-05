var mainPage = angular.module('mainPage', [
    'mainPage.poland',
    'mainPage.world',
    'mainPage.economy',
    'mainPage.magazine'
    ]);
mainPage.controller('mainPageCtr',function($scope){});
mainPage.config(function($stateProvider, $urlRouterProvider) {

    $stateProvider
            .state('main', {
                url: '/main',
                views:{
                    '': {
                        templateUrl: 'main/main.html'
                    },
                    'poland-main@main': {
                        templateUrl: 'main/poland/poland-main.html'
                    },
                    'world-main@main': {
                        templateUrl: 'main/world/world-main.html'
                    },
                    'economy-main@main': {
                        templateUrl: 'main/economy/economy-main.html'
                    },
                    'magazine-main@main': {
                        templateUrl: 'main/magazine/magazine-main.html'
                    }
                }
            });

});