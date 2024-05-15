package com.ch.doudemo.activity

// Chrome浏览器和饺子demo(android.MediaPlayer)相同时间相同网络环境播放，速度相差很远，为什么。
// ijk好像略快，但没有电脑的chrome快。红米手机的自带浏览器可以完整观看视频无需中途加载。


val cn = "https://hcdn.haoyiku.cc"
val us = "https://hcdn.haoyiku.cc"

var server_name: String = cn

val ldjVideos = arrayOf(

    "$server_name/message/assets/video/2024/05/08/719eeef6-e1e8-42d0-9b00-85b6cb1fff72___19225KB.mp4",
    "$server_name/message/assets/video/2024/05/08/48310ff8-d79b-4264-b637-c43519b8c712___19737KB.mp4",
    "$server_name/message/assets/video/2023/08/30/dee3bdfc-013b-4138-9b74-a87b6c826a60___15362KB.mp4",
    "$server_name/spider/111-231-8-26/assets/video/2024/03/27/4bde45ef-71d0-44a1-b760-27ff2569682f___1397KB.mp4",
    "$server_name/micro-goods/136712714/assets/video/2024/05/13/25bc1dcb-d8d7-47ea-b015-975da30a9d31___9048KB_compressed.mp4",
    "$server_name/message/assets/video/2024/04/03/689f8a95-cb39-4cf5-b299-d3465dd75936___2164KB.mp4",
    "$server_name/message/assets/video/2024/03/18/8fd86f97-5fab-4606-b028-b9f69847ab1d___2382KB.mp4",
    "$server_name/message/assets/video/2024/03/18/ee6906c4-65ca-48e2-aa50-27d1e4f0277a___1791KB.mp4",
    "$server_name/micro-goods/assets/video/2023/08/23/8dd0315e-4ecc-4d09-85fc-deae8eca3e6d___1340KB.mp4",
    "$server_name/message/assets/video/2024/04/24/4e70272d-a9fe-43ad-9ee0-ba0b81bdc1f3___4353KB.mp4",
    "$server_name/message/assets/video/2024/05/12/cbe1e6e0-b4c5-4e86-935f-96eb3c5d5b92___18807KB.MP4",
    "$server_name/message/assets/video/2024/05/12/6c71eb0b-fba0-4198-bef8-b183833e2577___18305KB.MP4",
    "$server_name/message/assets/video/2024/05/12/5c1742e9-a797-48e3-9b01-285274df4f8f___18580KB.MP4",
    "$server_name/message/assets/video/2024/05/12/8230c2f8-2640-4fe7-8f65-737ab9528be1___19104KB.MP4",
    "$server_name/message/assets/video/2024/05/10/d6010d42-9cf5-4537-87d9-95f470936ccf___5748KB.mp4",
    "$server_name/message/assets/video/2024/05/09/79aba975-1b8c-4a8c-bc13-a39616d48c1f___17458KB.mp4",
    "$server_name/message/assets/video/2024/05/08/de7f859c-911a-4b6f-b2e9-98f3aebedb3b___8326KB.mp4",
    "$server_name/message/assets/video/2024/05/08/6864ace7-d872-4a69-8246-f3d31e3c411c___1844KB.mp4",
    "$server_name/message/assets/video/2024/05/08/10d5b66f-a48b-450f-bfba-ab874d575812___19225KB.mp4",
    "$server_name/message/assets/video/2024/05/12/6c71eb0b-fba0-4198-bef8-b183833e2577___18305KB.MP4",
    "$server_name/message/assets/video/2024/05/12/5c1742e9-a797-48e3-9b01-285274df4f8f___18580KB.MP4",
    "$server_name/message/assets/video/2024/05/12/8230c2f8-2640-4fe7-8f65-737ab9528be1___19104KB.MP4",
    "$server_name/message/assets/video/2024/05/10/0766d5d3-94cf-492e-aca4-e7703b2c018b___2193KB.mp4",
    "$server_name/message/assets/video/2024/05/08/a088255c-036e-4bda-90d9-76c1f1987864___19631KB.mp4",
    "$server_name/message/assets/video/2024/05/08/ff24c4f3-d9d9-459f-8f14-6b907e1a06c6___14768KB.mp4",

    "$server_name/message/assets/video/2023/03/10/25069e74-6057-43a9-90f4-1b2490987ca1___888KB.mp4",
    "$server_name/message/assets/video/2024/03/06/c3ef33a8-9375-4a75-9caf-a0221607cd34___9146KB.mp4",
    "$server_name/message/assets/video/2024/03/06/30d5959f-32a4-4f15-8e8a-bc21b7e38293___2022KB.mp4",
    "$server_name/message/assets/video/2024/03/04/d8331ed9-bb4f-47c8-b6ff-da7a2179f895___3140KB.mp4",

)

val cndVideos = arrayOf(
    "$server_name/message/assets/video/2023/08/30/dee3bdfc-013b-4138-9b74-a87b6c826a60___15362KB.mp4",
    "$server_name/message/assets/video/2024/05/12/cbe1e6e0-b4c5-4e86-935f-96eb3c5d5b92___18807KB.MP4",
    "$server_name/message/assets/video/2024/05/12/6c71eb0b-fba0-4198-bef8-b183833e2577___18305KB.MP4",
    "$server_name/message/assets/video/2024/05/12/5c1742e9-a797-48e3-9b01-285274df4f8f___18580KB.MP4",
    "$server_name/message/assets/video/2024/05/12/8230c2f8-2640-4fe7-8f65-737ab9528be1___19104KB.MP4",
)

val cndThumbnail = arrayOf(
    "https://cdn.webuy.ai/base-service-webserver/130009441/assets/img/2024/05/09/c7c32ab4-84f9-41b4-8fc2-77d965760f50__281KB____size1279x1706.jpg",
    "",
    "",

    "https://cdn.webuy.ai/base-service-webserver/130009441/assets/img/2024/05/09/b7a4c91e-9c1c-4ab8-a4bf-3710eec495ac__224KB____size1279x1706.jpg",
    "https://cdn.webuy.ai/base-service-webserver/130009441/assets/img/2024/04/26/52391892-dad1-480e-b968-dbc5cd046c4b__3490KB____size1280x1706.png",
    "https://cdn.webuy.ai/app-301/136773777/assets/img/2024/05/13/8bd8f3cd-5551-4e2e-8407-42b2155e11b7__310KB____size800x800.jpeg"
)

val videos = arrayOf(
    //width > height
    "$server_name/message/assets/video/2024/05/08/719eeef6-e1e8-42d0-9b00-85b6cb1fff72___19225KB.mp4",
    "$server_name/message/assets/video/2024/05/08/48310ff8-d79b-4264-b637-c43519b8c712___19737KB.mp4",
    "$server_name/message/assets/video/2023/08/30/dee3bdfc-013b-4138-9b74-a87b6c826a60___15362KB.mp4",
    "$server_name/spider/111-231-8-26/assets/video/2024/03/27/4bde45ef-71d0-44a1-b760-27ff2569682f___1397KB.mp4",
    "$server_name/micro-goods/136712714/assets/video/2024/05/13/25bc1dcb-d8d7-47ea-b015-975da30a9d31___9048KB_compressed.mp4",
    "$server_name/message/assets/video/2024/04/03/689f8a95-cb39-4cf5-b299-d3465dd75936___2164KB.mp4",
    "$server_name/message/assets/video/2024/03/18/8fd86f97-5fab-4606-b028-b9f69847ab1d___2382KB.mp4",
    "$server_name/message/assets/video/2024/03/18/ee6906c4-65ca-48e2-aa50-27d1e4f0277a___1791KB.mp4",
    "$server_name/micro-goods/assets/video/2023/08/23/8dd0315e-4ecc-4d09-85fc-deae8eca3e6d___1340KB.mp4",
    "$server_name/message/assets/video/2024/04/24/4e70272d-a9fe-43ad-9ee0-ba0b81bdc1f3___4353KB.mp4",
    "$server_name/message/assets/video/2024/05/12/cbe1e6e0-b4c5-4e86-935f-96eb3c5d5b92___18807KB.MP4",
    "$server_name/message/assets/video/2024/05/12/6c71eb0b-fba0-4198-bef8-b183833e2577___18305KB.MP4",
    "$server_name/message/assets/video/2024/05/12/5c1742e9-a797-48e3-9b01-285274df4f8f___18580KB.MP4",
    "$server_name/message/assets/video/2024/05/12/8230c2f8-2640-4fe7-8f65-737ab9528be1___19104KB.MP4",
    "$server_name/message/assets/video/2024/05/10/d6010d42-9cf5-4537-87d9-95f470936ccf___5748KB.mp4",
    "$server_name/message/assets/video/2024/05/09/79aba975-1b8c-4a8c-bc13-a39616d48c1f___17458KB.mp4",
    "$server_name/message/assets/video/2024/05/08/de7f859c-911a-4b6f-b2e9-98f3aebedb3b___8326KB.mp4",
    "$server_name/message/assets/video/2024/05/08/6864ace7-d872-4a69-8246-f3d31e3c411c___1844KB.mp4",
    "$server_name/message/assets/video/2024/05/08/10d5b66f-a48b-450f-bfba-ab874d575812___19225KB.mp4",
    "$server_name/message/assets/video/2024/05/12/6c71eb0b-fba0-4198-bef8-b183833e2577___18305KB.MP4",
    "$server_name/message/assets/video/2024/05/12/5c1742e9-a797-48e3-9b01-285274df4f8f___18580KB.MP4",
    "$server_name/message/assets/video/2024/05/12/8230c2f8-2640-4fe7-8f65-737ab9528be1___19104KB.MP4",
    "$server_name/message/assets/video/2024/05/10/0766d5d3-94cf-492e-aca4-e7703b2c018b___2193KB.mp4",
    "$server_name/message/assets/video/2024/05/08/a088255c-036e-4bda-90d9-76c1f1987864___19631KB.mp4",
    "$server_name/message/assets/video/2024/05/08/ff24c4f3-d9d9-459f-8f14-6b907e1a06c6___14768KB.mp4",

    "$server_name/message/assets/video/2023/03/10/25069e74-6057-43a9-90f4-1b2490987ca1___888KB.mp4",
    "$server_name/message/assets/video/2024/03/06/c3ef33a8-9375-4a75-9caf-a0221607cd34___9146KB.mp4",
    "$server_name/message/assets/video/2024/03/06/30d5959f-32a4-4f15-8e8a-bc21b7e38293___2022KB.mp4",
    "$server_name/message/assets/video/2024/03/04/d8331ed9-bb4f-47c8-b6ff-da7a2179f895___3140KB.mp4",

    )

val thumbnails = arrayOf(
    "https://cdn.webuy.ai/base-service-webserver/121840287/assets/img/2024/05/08/25ac4f86-cb6c-4f89-9657-f86c48db45a2__244KB____size1280x1707.jpg",
    "https://cdn.webuy.ai/base-service-webserver/121840287/assets/img/2024/05/08/a3f01737-9891-481a-a3f6-5528aea3f57d__239KB____size1280x1707.jpg",
    "https://cdn.webuy.ai/base-service-webserver/121840287/assets/img/2024/05/08/4ec132fe-6443-4b99-9d2b-247389961e51__186KB____size1170x1560.jpg",
    "https://cdn.webuy.ai/base-service-webserver/121840287/assets/img/2024/05/08/862a8a4c-514f-4fd5-b6a5-56b595735b22__266KB____size1280x1707.jpg",
    "https://cdn.webuy.ai/base-service-webserver/121840287/assets/img/2024/05/09/d22244f9-6871-4747-968c-61cd1b4b446b__268KB____size1276x1710.jpg",
    "https://cdn.webuy.ai/materialplatform/assets/img/2024/05/10/1715337872566dccccd38b5f78925da0e69bd89569576.jpg",
    "https://cdn.webuy.ai/base-service-webserver/47290019/assets/img/2024/02/06/8e0ccf8e-dfd5-4269-a94b-ec7d701cca49__398KB____size1276x1702.jpg",
    "https://cdn.webuy.ai/base-service-webserver/121840287/assets/img/2024/05/10/3b41558d-8d80-49c4-bc18-6aec2811c6cf__262KB____size1280x1707.jpg",
    "https://cdn.webuy.ai/base-service-webserver/121840287/assets/img/2024/05/10/30b716ad-4b2c-44c0-881d-bde6c27595f4__299KB____size1280x1707.jpg",
    "https://cdn.webuy.ai/base-service-webserver/121840287/assets/img/2024/05/10/16b7389f-e361-41db-912c-623f69dbaaf1__360KB____size1278x1704.jpg",
    "https://cdn.webuy.ai/base-service-webserver/121840287/assets/img/2024/05/10/071124e0-7b92-44ad-9794-ce49c541914c__271KB____size1280x1706.jpg",
    "https://cdn.webuy.ai/base-service-webserver/121840287/assets/img/2024/05/08/5153dc41-ae7d-45e6-bc19-65d4009dbf4a__93KB____size750x751.jpg",
    "https://cdn.webuy.ai/base-service-webserver/121840287/assets/img/2024/05/10/eed50967-44cc-4ec6-af14-a77ee2cf8c87__141KB____size1280x1706.jpg",
    "https://cdn.webuy.ai/base-service-webserver/121840287/assets/img/2024/05/10/c6e5006f-5e5d-47a1-ad7f-34c7d1434029__250KB____size1280x1706.jpg",
    "https://cdn.webuy.ai/base-service-webserver/47290019/assets/img/2024/02/06/dc8eab68-2305-44b5-8214-8afd38da2ab5__242KB____size1280x1707.jpg",
    "https://cdn.webuy.ai/base-service-webserver/47290019/assets/img/2024/02/06/cf6078b2-a1d1-4f52-b938-21db3caef125__228KB____size1280x1707.jpg",
    "https://cdn.webuy.ai/base-service-webserver/52563318/assets/img/2024/05/11/9d321bbc-803b-499c-9f25-fcc684dcf89b__422KB____size1440x1920.jpg",
    "https://cdn.webuy.ai/base-service-webserver/52563318/assets/img/2024/05/11/5a3580a4-5f4d-4b23-9707-eee9771d1fd6__381KB____size1440x1920.jpg",
    "https://cdn.webuy.ai/base-service-webserver/52563318/assets/img/2024/05/11/739d61fc-2c37-4735-812a-fcafbbf27c59__381KB____size1440x1920.jpg",
    "https://cdn.webuy.ai/base-service-webserver/52563318/assets/img/2024/05/11/a5b62f32-590c-4357-99a6-ca737f66c888__337KB____size1440x1920.jpg",

    //height > width
    "https://cdn.webuy.ai/base-service-webserver/52563318/assets/img/2024/05/11/026e716b-2cf8-4907-8422-00f6972951ee__353KB____size1440x1920.jpg",
    "https://cdn.webuy.ai/base-service-webserver/52563318/assets/img/2024/05/10/df41e538-f762-4de0-8d1e-8e5222549b0c__509KB____size1440x1920.jpg",
    "https://cdn.webuy.ai/base-service-webserver/52563318/assets/img/2024/05/10/30af9839-a970-4548-9728-1fae01a4e3e1__670KB____size1440x1920.jpg",
    "https://cdn.webuy.ai/base-service-webserver/52563318/assets/img/2024/05/09/4aef0716-a420-4549-931f-83bb4268e6d0__197KB____size1280x1707.jpg",
    "https://cdn.webuy.ai/base-service-webserver/52563318/assets/img/2024/05/10/2467cf65-3ead-4100-a580-afb774faf139__718KB____size1440x1920.jpg",
    "https://cdn.webuy.ai/base-service-webserver/52563318/assets/img/2024/05/09/9dd903e7-1319-45fc-8231-3b00b2009184__273KB____size1280x1707.jpg",
    "https://cdn.webuy.ai/base-service-webserver/52563318/assets/img/2024/05/10/686ee646-1429-46b2-92ef-784640b807d1__613KB____size1440x1920.jpg"

)

val titles = arrayOf(
    //width > height
    "饺子主动",
    "饺子运动",
    "饺子有活",
    "饺子星光",
    "饺子想吹",
    "饺子汪汪",
    "饺子偷人",
    "饺子跳",
    "饺子受不了",
    "饺子三位",

    "饺子起飞",
    "饺子你听",
    "饺子可以了",
    "饺子还小",
    "饺子高兴",
    "饺子高冷",
    "饺子堵住了",
    "饺子都懂",
    "饺子打电话",
    "饺子不服",

    //height > width
    "饺子还年轻",
    "饺子好妈妈",
    "饺子可以",
    "饺子挺住",
    "饺子想听",
    "饺子真会",
    "饺子真萌"
)

val vl1 = videos.copyOfRange(0, 9)
val pl1 = thumbnails.copyOfRange(0, 9)
val tl1 = titles.copyOfRange(0, 9)

val vl2 = videos.copyOfRange(10, 20)
val pl2 = thumbnails.copyOfRange(10, 20)
val tl2 = titles.copyOfRange(10, 20)

val vl3 = videos.copyOfRange(20, 26)
val pl3 = thumbnails.copyOfRange(20, 26)
val tl3 = titles.copyOfRange(20, 26)


val vll = arrayOf(
    vl1, vl2, vl3
)

val pll = arrayOf(
    pl1, pl2, pl3
)

val tll = arrayOf(
    tl1, tl2, tl3
)





