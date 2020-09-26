const express =  require('express');
const app =  express();
const port =  process.env.PORT  ||  8081
var msg = 'Hello World';
// Route to be tested
app.get('/', (req, res) => {
    return res.status(200).json({ nome:  'Rafael Dias' });
});
// Application running on the door
let server = app.listen(port, '0.0.0.0', () => {
    console.log(`Application running on ${port}`);
});
module.exports  = server;
