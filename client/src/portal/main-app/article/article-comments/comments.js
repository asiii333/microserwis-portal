var articleComments = angular.module('article.comments',[])

.controller('commentsCtr', function($scope,$stateParams){

    $scope.newComment = {};
     $scope.articleNum =  $stateParams.artNum  //ze sciezki
     $scope.allComments = getAllComents();

     $scope.addComent = function addComent(){
        console.log("add comments");
        return;
     }

     function getAllComents(){
        console.log("add comments");
        return;
     }


});