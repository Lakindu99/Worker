const express = require('express');
const app = express();
const port = 3000;

// Sample data for construction items
const items = [
  { "id": 1, "name": "Cement", "price": "1000.00","imageUrl":"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT3taE_JoktoKM-aQNw7y6MWpWQyMvEYbGeiw&s","websiteUrl":"https://asirihardware.lk/" },
  { "id": 2, "name": "Sand", "price": "200.00","imageUrl":"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQR4v52SgiMrtcHgsfSIbfvmuQkDgwMjrTRlfZHD85cX5pQ-f_qpQpSicjfa5YvwyhsKd4&usqp=CAU","websiteUrl":"https://asirihardware.lk/" },
  { "id": 3, "name": "Gravel", "price": "300.00","imageUrl":"https://d1d81vmw1yvc7o.cloudfront.net/wp-content/uploads/sites/317/2019/12/11090449/stone-3331916_1280-1024x682.jpg","websiteUrl":"https://asirihardware.lk/" },
  { "id": 4, "name": "Steel Rebar", "price": "1500.00","imageUrl":"https://metalexponents.com/wp-content/uploads/2020/12/High-Ductility.jpg","websiteUrl":"https://asirihardware.lk/" },
  { "id": 5, "name": "Bricks", "price": "500.00","imageUrl":"https://www.thespruce.com/thmb/XS4rPkgVLZXKpG0jvTRatbD98ss=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc()/GettyImages-1250432112-9ca4ae90c5374a26adb1ce892c46e365.jpg","websiteUrl":"https://asirihardware.lk/" },
  { "id": 6, "name": "Concrete Blocks", "price": "800.00","imageUrl":"https://qgreentech.com/wp-content/uploads/2021/10/Untitled-1.jpg","websiteUrl":"https://asirihardware.lk/" },
  { "id": 7, "name": "Plywood", "price": "700.00","imageUrl":"https://3.imimg.com/data3/BT/YD/MY-13213436/plywood-timber-500x500.jpg","websiteUrl":"https://asirihardware.lk/" },
  { "id": 8, "name": "Timber", "price": "1200.00","imageUrl":"https://www.vskills.in/certification/blog/wp-content/uploads/2015/02/timber-as-construction-material.jpg","websiteUrl":"https://asirihardware.lk/" },
  { "id": 9, "name": "Glass", "price": "1100.00","imageUrl":"https://cdn.open-pr.com/W/8/W825628023_g.jpg","websiteUrl":"https://asirihardware.lk/" },
  { "id": 10, "name": "Paint", "price": "400.00","imageUrl":"https://en.idei.club/uploads/posts/2023-06/thumbs/1686421160_en-idei-club-p-construction-materials-paint-dizain-krasiv-33.jpg","websiteUrl":"https://asirihardware.lk/" },
  { "id": 11, "name": "Roof Tiles", "price": "1300.00","imageUrl":"https://cdn-caahk.nitrocdn.com/FxeDYgwjWoVQbTyhmhzRPZfDqdNEvzCy/assets/static/optimized/rev-624f53f/wp-content/uploads/2021/06/Clay-Roof-Tiles-1024x536.png","websiteUrl":"https://asirihardware.lk/" },
  { "id": 12, "name": "Insulation", "price": "600.00","imageUrl":"https://miro.medium.com/v2/resize:fit:1200/1*G3SwSuWKOAspNhJ4Mtm0bQ.jpeg","websiteUrl":"https://asirihardware.lk/" },
  { "id": 13, "name": "PVC Pipes", "price": "350.00","imageUrl":"https://img.forconstructionpros.com/files/base/acbm/fcp/image/2022/09/AdobeStock_251897649_Koonsiri.632cd3887522c.png?auto=format%2Ccompress&q=70","websiteUrl":"https://asirihardware.lk/" },
  { "id": 14, "name": "Copper Pipes", "price": "1600.00","imageUrl":"https://3.imimg.com/data3/XO/SA/GLADMIN-10347605/d-500x500.png","websiteUrl":"https://asirihardware.lk/" },
  { "id": 15, "name": "Electrical Wiring", "price": "900.00","imageUrl":"https://technocable.com/wp-content/uploads/iStock-538176722.jpg","websiteUrl":"https://asirihardware.lk/" },
  { "id": 16, "name": "Light Fixtures", "price": "450.00","imageUrl":"https://images.squarespace-cdn.com/content/v1/5cc9d678797f74514e09078f/1613170676160-BBYEVE7HCR4FXNHW33SU/Commercial-Building-Lighting-Fixtures-Trends-in-2020-1.jpg","websiteUrl":"https://asirihardware.lk/" },
  { "id": 17, "name": "Doors", "price": "750.00","imageUrl":"https://www.researchdive.com/blogImages/JeGH57fm3s.jpeg","websiteUrl":"https://asirihardware.lk/" },
  { "id": 18, "name": "Windows", "price": "950.00","imageUrl":"https://qcwindows.com/wp-content/uploads/sites/2/2017/11/Marvin-Replacement-Window-Inserts.jpg","websiteUrl":"https://asirihardware.lk/" },
  { "id": 19, "name": "Nails", "price": "50.00","imageUrl":"https://www.buildworld.co.uk/blogimages/masonary-nail.jpg","websiteUrl":"https://asirihardware.lk/" },
  { "id": 20, "name": "Screws", "price": "40.00","imageUrl":"https://www.peakoak.co.uk/wp-content/uploads/2024/01/spax-wood-construction-screws.jpg","websiteUrl":"https://asirihardware.lk/" }
]
;

// GET endpoint to fetch construction items
app.get('/items', (req, res) => {
    res.json(items);
});

app.listen(port, () => {
    console.log(`Server is running on http://localhost:${port}`);
});
