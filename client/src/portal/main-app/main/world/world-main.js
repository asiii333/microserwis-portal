var mainPageWorld = angular.module('mainPage.world',[])
.controller('mainPageWorldCtr', function($scope, $http){

        getArticle();

        function getArticle(){
            console.log('get article for main-module world');

            var path = $scope.titleServisAdress + "/title/main/swiat";

            $http.get(path)
                .then(function(response) {
                    $scope.articles =  response.data;
                    console.log(response.data);
            });
        }

});