/**
 * 重构前
 */
function printOwing(invoice) {
    let outstanding = 0;
    console.log("***********************");
    console.log("**** Customer Owes ****");
    console.log("***********************");
    // calculate outstanding
    for (const o of invoice.orders) {
        outstanding += o.amount;
    }
    // record due date
    const today = Clock.today;
    invoice.dueDate = new Date(today.getFullYear(), today.getMonth(), today.getDate() + 30);
    //print details
    console.log(`name: ${invoice.customer}`);
    console.log(`amount: ${outstanding}`);
    console.log(`due: ${invoice.dueDate.toLocaleDateString()}`);
}

/**
 * 重构后
 */
function printOwing(invoice) {

    // print banner
    printBanner()

    // calculate outstanding
    let outstanding = calculateOutstanding(invoice);

    // record due date
    recordDueDate(invoice)

    //print details
    printDetail(invoice, outstanding);
}

function calculateOutstanding(invoice) {
    let temp = 0;
    for (const o of invoice.orders) {
        temp += o.amount;
    }
    return temp;
}

function printBanner() {
    console.log("***********************");
    console.log("**** Customer Owes ****");
    console.log("***********************");
}

function printDetail(invoice, outstanding) {
    console.log(`name: ${invoice.customer}`);
    console.log(`amount: ${outstanding}`);
    console.log(`due: ${invoice.dueDate.toLocaleDateString()}`);
}

function recordDueDate(invoice) {
    const today = Clock.today;
    invoice.dueDate = new Date(today.getFullYear(), today.getMonth(), today.getDate() + 30);
}

