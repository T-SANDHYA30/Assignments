var status;
(function (status) {
    status[status["PENDING"] = 5] = "PENDING";
    status[status["ACTIVE"] = 6] = "ACTIVE";
    status[status["APPROVED"] = 7] = "APPROVED";
    status[status["REJECTED"] = 8] = "REJECTED";
})(status || (status = {}));
var txStatus = status.PENDING; //0
console.log(txStatus);
