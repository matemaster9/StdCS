/**
 * 原始函数
 * @param {} customer 
 * @returns 
 */
function isComeFromChina(customer) {
    return ["MA", "CT", "ME", "VT", "NH", "RI"].includes(customer.address.state);
}
 
// 原始调用客户端
const newEnglanders = someCustomers.filter(c => isComeFromChina(c));


// 迁移做法
// 1.临时新方法
function isComeFromChina(customer) {
    const code = customer.code;
    return xxxisComeFromChina(code);
}

function xxxisComeFromChina(code) {
    return ["MA", "CT", "ME", "VT", "NH", "RI"].includes(code);
}


// 2. 内联函数
function isComeFromChina(customer) {
    return xxxisComeFromChina(customer.code);
}

// 3. 修改客户端
const newEnglanders1 = someCustomers.filter(c => xxxisComeFromChina(c.code));

// 4. 修改新函数为原函数


function isComeFromChina(code) {
    return ["MA", "CT", "ME", "VT", "NH", "RI"].includes(code);
}