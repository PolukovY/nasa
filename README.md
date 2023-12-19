# Getting Started

- Register in [Nasa](https://api.nasa.gov/) and get API key
- run application PicturesApplication and pass api key to -DNASA_API_KEY=api_key

- trigger API via curl command

```curl
curl --location 'http://localhost:8080/collect/pictures' \
--header 'Content-Type: application/json' \
--data '{
    "sol":16
 }'
```

response status 200 OK:

```json
{
  "NasaCamera[id=26, name=NAVCAM]": [
    {
      "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00014/opgs/edr/ncam/NLA_398747854EDR_D0030004NCAM00502M_.JPG"
    },
    {
      "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00014/opgs/edr/ncam/NRA_398742207EDR_F0030004NCAM00105M_.JPG"
    },
    {
      "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00014/opgs/edr/ncam/NLA_398742309EDR_F0030004NCAM00121M_.JPG"
    },
    {
      "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00014/opgs/edr/ncam/NLA_398742273EDR_F0030004NCAM00105M_.JPG"
    },
    {
      "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00014/opgs/edr/ncam/NLA_398742240EDR_F0030004NCAM00105M_.JPG"
    },
    {
      "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00014/opgs/edr/ncam/NLA_398742207EDR_F0030004NCAM00105M_.JPG"
    },
    {
      "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00014/opgs/edr/ncam/NLA_398748499EDR_D0030004NCAM00501M_.JPG"
    },
    {
      "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00014/opgs/edr/ncam/NLA_398748480EDR_D0030004NCAM00501M_.JPG"
    },
    {
      "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00014/opgs/edr/ncam/NLA_398748461EDR_D0030004NCAM00501M_.JPG"
    },
    {
      "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00014/opgs/edr/ncam/NLA_398748442EDR_D0030004NCAM00501M_.JPG"
    },
    {
      "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00014/opgs/edr/ncam/NLA_398748423EDR_D0030004NCAM00501M_.JPG"
    },
    {
      "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00014/opgs/edr/ncam/NLA_398748404EDR_D0030004NCAM00501M_.JPG"
    },
    {
      "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00014/opgs/edr/ncam/NLA_398748385EDR_D0030004NCAM00501M_.JPG"
    },
    {
      "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00014/opgs/edr/ncam/NLA_398748366EDR_D0030004NCAM00501M_.JPG"
    },
    {
      "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00014/opgs/edr/ncam/NLA_398748347EDR_D0030004NCAM00501M_.JPG"
    },
    {
      "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00014/opgs/edr/ncam/NLA_398748328EDR_D0030004NCAM00501M_.JPG"
    },
    {
      "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00014/opgs/edr/ncam/NLA_398748309EDR_D0030004NCAM00501M_.JPG"
    },
    {
      "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00014/opgs/edr/ncam/NLA_398748290EDR_D0030004NCAM00501M_.JPG"
    },
    {
      "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00014/opgs/edr/ncam/NLA_398748271EDR_D0030004NCAM00501M_.JPG"
    },
    {
      "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00014/opgs/edr/ncam/NLA_398748252EDR_D0030004NCAM00501M_.JPG"
    },
    {
      "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00014/opgs/edr/ncam/NLA_398748233EDR_D0030004NCAM00501M_.JPG"
    },
    {
      "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00014/opgs/edr/ncam/NLA_398748213EDR_D0030004NCAM00501M_.JPG"
    },
    {
      "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00014/opgs/edr/ncam/NLA_398748140EDR_D0030004NCAM00502M_.JPG"
    },
    {
      "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00014/opgs/edr/ncam/NLA_398748121EDR_D0030004NCAM00502M_.JPG"
    },
    {
      "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00014/opgs/edr/ncam/NLA_398748102EDR_D0030004NCAM00502M_.JPG"
    },
    {
      "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00014/opgs/edr/ncam/NLA_398748083EDR_D0030004NCAM00502M_.JPG"
    },
    {
      "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00014/opgs/edr/ncam/NLA_398748064EDR_D0030004NCAM00502M_.JPG"
    },
    {
      "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00014/opgs/edr/ncam/NLA_398748045EDR_D0030004NCAM00502M_.JPG"
    },
    {
      "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00014/opgs/edr/ncam/NLA_398748026EDR_D0030004NCAM00502M_.JPG"
    },
    {
      "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00014/opgs/edr/ncam/NLA_398748007EDR_D0030004NCAM00502M_.JPG"
    },
    {
      "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00014/opgs/edr/ncam/NLA_398747988EDR_D0030004NCAM00502M_.JPG"
    },
    {
      "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00014/opgs/edr/ncam/NLA_398747969EDR_D0030004NCAM00502M_.JPG"
    },
    {
      "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00014/opgs/edr/ncam/NLA_398747950EDR_D0030004NCAM00502M_.JPG"
    },
    {
      "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00014/opgs/edr/ncam/NLA_398747931EDR_D0030004NCAM00502M_.JPG"
    },
    {
      "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00014/opgs/edr/ncam/NLA_398747912EDR_D0030004NCAM00502M_.JPG"
    },
    {
      "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00014/opgs/edr/ncam/NLA_398747893EDR_D0030004NCAM00502M_.JPG"
    },
    {
      "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00014/opgs/edr/ncam/NLA_398747874EDR_D0030004NCAM00502M_.JPG"
    },
    {
      "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00014/opgs/edr/ncam/NRA_398742349EDR_F0030004NCAM00121M_.JPG"
    },
    {
      "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00014/opgs/edr/ncam/NRA_398742273EDR_F0030004NCAM00105M_.JPG"
    },
    {
      "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00014/opgs/edr/ncam/NRA_398742240EDR_F0030004NCAM00105M_.JPG"
    }
  ],
  "NasaCamera[id=23, name=CHEMCAM]": [
    {
      "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/ods/surface/sol/00014/soas/rdr/ccam/CR0_398736578PRC_F0030004CCAM01014L1.PNG"
    },
    {
      "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00014/opgs/edr/ccam/CR0_398737757EDR_F0030004CCAM04014M_.JPG"
    },
    {
      "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00014/opgs/edr/ccam/CR0_398737568EDR_F0030004CCAM03014M_.JPG"
    },
    {
      "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00014/opgs/edr/ccam/CR0_398737329EDR_F0030004CCAM02014M_.JPG"
    },
    {
      "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00014/opgs/edr/ccam/CR0_398737093EDR_F0030004CCAM02014M_.JPG"
    },
    {
      "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00014/opgs/edr/ccam/CR0_398736852EDR_F0030004CCAM01014M_.JPG"
    },
    {
      "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00014/opgs/edr/ccam/CR0_398736578EDR_F0030004CCAM01014M_.JPG"
    },
    {
      "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/ods/surface/sol/00014/soas/rdr/ccam/CR0_398737757PRC_F0030004CCAM04014L1.PNG"
    },
    {
      "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/ods/surface/sol/00014/soas/rdr/ccam/CR0_398737568PRC_F0030004CCAM03014L1.PNG"
    },
    {
      "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/ods/surface/sol/00014/soas/rdr/ccam/CR0_398737329PRC_F0030004CCAM02014L1.PNG"
    },
    {
      "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/ods/surface/sol/00014/soas/rdr/ccam/CR0_398737093PRC_F0030004CCAM02014L1.PNG"
    },
    {
      "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/ods/surface/sol/00014/soas/rdr/ccam/CR0_398736852PRC_F0030004CCAM01014L1.PNG"
    }
  ],
  "NasaCamera[id=20, name=FHAZ]": [
    {
      "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00014/opgs/edr/fcam/FRA_398741806EDR_F0030004FHAZ00200M_.JPG"
    },
    {
      "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00014/opgs/edr/fcam/FLA_398742695EDR_F0030004FHAZ00200M_.JPG"
    },
    {
      "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00014/opgs/edr/fcam/FRA_398742695EDR_F0030004FHAZ00200M_.JPG"
    },
    {
      "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00014/opgs/edr/fcam/FLA_398741806EDR_F0030004FHAZ00200M_.JPG"
    }
  ],
  "NasaCamera[id=22, name=MAST]": [
    {
      "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/msss/00014/mcam/0014ML0000210000100207I01_DXXX.jpg"
    },
    {
      "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/msss/00014/mcam/0014ML0000160000100208E01_DXXX.jpg"
    },
    {
      "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/msss/00014/mcam/0014MR0000210020100071E01_DXXX.jpg"
    },
    {
      "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/msss/00014/mcam/0014ML0000170000100212E01_DXXX.jpg"
    },
    {
      "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/msss/00014/mcam/0014ML0000200000100211E01_DXXX.jpg"
    },
    {
      "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/msss/00014/mcam/0014ML0000190000100210E01_DXXX.jpg"
    },
    {
      "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/msss/00014/mcam/0014ML0000180000100209E01_DXXX.jpg"
    },
    {
      "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/msss/00014/mcam/0014ML0000210000100207E02_DXXX.jpg"
    },
    {
      "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/msss/00014/mcam/0014ML0000170000100212I01_DXXX.jpg"
    },
    {
      "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/msss/00014/mcam/0014ML0000200000100211I01_DXXX.jpg"
    },
    {
      "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/msss/00014/mcam/0014ML0000190000100210I01_DXXX.jpg"
    },
    {
      "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/msss/00014/mcam/0014ML0000180000100209I01_DXXX.jpg"
    },
    {
      "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/msss/00014/mcam/0014ML0000160000100208I01_DXXX.jpg"
    },
    {
      "imgSrc": "http://mars.jpl.nasa.gov/msl-raw-images/msss/00014/mcam/0014MR0000210020100071I01_DXXX.jpg"
    }
  ]
}
```


- long to database via [UI](http://localhost:8080/h2-console/)

<img width="478" alt="image" src="https://github.com/BlyznytsiaOrg/bring/assets/73576438/376934e3-ff68-45f6-8451-e0fc89fbd707">

- after connect try to fetch data from tables:

<img width="659" alt="Screenshot 2023-12-17 at 19 55 06" src="https://github.com/BlyznytsiaOrg/bring/assets/73576438/c9d2c572-1e9a-4f5b-9077-04a550fb9d16">

<img width="1441" alt="Screenshot 2023-12-17 at 19 55 15" src="https://github.com/BlyznytsiaOrg/bring/assets/73576438/b7dc2592-ad77-4555-b63a-974008e4b5e7">




