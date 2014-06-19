angular.module('pony',['ngResource'])
    .controller('PonyCtrl',function($scope,$resource){
        $scope.isRevealed = false;

        var PonyResource = $resource('/api/pony/best');

        $scope.onClick = function(){
            var pony  =PonyResource.get(function(){
                $scope.isRevealed= true;
                $scope.pony = pony
            });
        };
    });