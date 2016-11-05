var mainPageMagazine = angular.module('mainPage.magazine',[])
.controller('mainPageMagazineCtr', function($scope){

             getArticle();

             function getArticle(){
                 console.log('get article for main-module magazine');

                 var path = $scope.titleServisAdress + "/title/main/magazyn";

                 $http.get(path)
                     .then(function(response) {
                         $scope.articles =  response.data;
                         console.log(response.data);
                 });
             }

});