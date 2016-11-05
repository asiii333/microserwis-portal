var categoryPoland = angular.module('category.articleList',[])
.controller('categoryArticleListCtr',

    function($scope, $stateParams, $http){

        $scope.categoryName = $stateParams.categoryName;  //ze sciezki
        getArticleList();

        function getArticleList(){
            console.log('get article list for: ' + $scope.categoryName);
            var path = $scope.titleServisAdress + "/title/" + $scope.categoryName + "/1";

                $http.get(path)
                    .then(function(response) {
                        $scope.articleList =  response.data;
                        console.log(response.data);
                    });
        }

});