# change serializer rules #

for example: object normal serializer like this:
    {
        "arrayIds": [
        6000,
        7000
        ],
        "id": 1000,
        "listIds": [
            3000,
            4000,
            5000
        ],
        "noMetaId": 8000,
        "stringId": "2000"
    }


# but, wo can change serializer rules, serializer like this #
    {
        "arrayIds": [
            6000,
            7000
        ],
        "arrayIdsMeta": [
            {
                "id": 6000,
                "name": "name_6000"
            },
            {
                "id": 7000,
                "name": "name_7000"
            }
        ],
        "id": 1000,
        "idMeta": {
            "id": 1000,
            "name": "name_1000"
        },
        "listIds": [
            3000,
            4000,
            5000
        ],
        "listIdsMeta": [
            {
                "id": 3000,
                "name": "name_3000"
            },
            {
                "id": 4000,
                "name": "name_4000"
            },
            {
                "id": 5000,
                "name": "name_5000"
            }
        ],
        "noMetaId": 8000,
        "stringId": "2000",
        "stringIdMeta": {
            "id": 2000,
            "name": "name_2000"
        }
    }


#required#
    this module dependency https://github.com/TigerPengPeng/core.git
    first, you need git clone https://github.com/TigerPengPeng/core.git to local
    and then, run mvn clean install -DskipTests -U


    if you are using ide to import this model, you need install plugins lombok
