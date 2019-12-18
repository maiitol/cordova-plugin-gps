/*global cordova, module*/

module.exports = {
    capture: function (object, successCallback, errorCallback) {
        cordova.exec(successCallback, errorCallback, "Gps", "capture", object);
    }
};
