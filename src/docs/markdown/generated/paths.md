
<a name="paths"></a>
## Paths

<a name="addusingpost"></a>
### add
```
POST /user/add
```


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Header**|**access_token**  <br>*required*|user access token|string|
|**Header**|**timestamp**  <br>*optional*|access timestamp|integer (int32)|
|**Body**|**user**  <br>*required*|user|[用户基本信息](#f27103dead187fe6c304ecd07f70768d)|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[Result](#result)|
|**201**|Created|No Content|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Consumes

* `application/json`


#### Produces

* `*/*`


#### Tags

* user-controller


#### Security

|Type|Name|Scopes|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|


<a name="deleteusingpost"></a>
### delete
```
POST /user/delete
```


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Header**|**access_token**  <br>*required*|user access token|string|
|**Header**|**timestamp**  <br>*optional*|access timestamp|integer (int32)|
|**Query**|**id**  <br>*required*|id|integer (int32)|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[Result](#result)|
|**201**|Created|No Content|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Consumes

* `application/json`


#### Produces

* `*/*`


#### Tags

* user-controller


#### Security

|Type|Name|Scopes|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|


<a name="detailusingpost"></a>
### detail
```
POST /user/detail
```


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Header**|**access_token**  <br>*required*|user access token|string|
|**Header**|**timestamp**  <br>*optional*|access timestamp|integer (int32)|
|**Query**|**id**  <br>*required*|id|integer (int32)|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[Result](#result)|
|**201**|Created|No Content|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Consumes

* `application/json`


#### Produces

* `*/*`


#### Tags

* user-controller


#### Security

|Type|Name|Scopes|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|


<a name="listusingpost"></a>
### list
```
POST /user/list
```


#### Parameters

|Type|Name|Description|Schema|Default|
|---|---|---|---|---|
|**Header**|**access_token**  <br>*required*|user access token|string||
|**Header**|**timestamp**  <br>*optional*|access timestamp|integer (int32)||
|**Query**|**page**  <br>*optional*|page|integer (int32)|`0`|
|**Query**|**size**  <br>*optional*|size|integer (int32)|`0`|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[Result](#result)|
|**201**|Created|No Content|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Consumes

* `application/json`


#### Produces

* `*/*`


#### Tags

* user-controller


#### Security

|Type|Name|Scopes|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|


<a name="testusingget"></a>
### test
```
GET /user/test
```


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Header**|**access_token**  <br>*required*|user access token|string|
|**Header**|**timestamp**  <br>*optional*|access timestamp|integer (int32)|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[Result](#result)|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Produces

* `*/*`


#### Tags

* user-controller


#### Security

|Type|Name|Scopes|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|


<a name="updateusingpost"></a>
### update
```
POST /user/update
```


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Header**|**access_token**  <br>*required*|user access token|string|
|**Header**|**timestamp**  <br>*optional*|access timestamp|integer (int32)|
|**Query**|**id**  <br>*optional*||integer (int32)|
|**Query**|**nickName**  <br>*optional*|用户昵称|string|
|**Query**|**password**  <br>*optional*|密码|string|
|**Query**|**registerDate**  <br>*optional*|注册日期|string (date-time)|
|**Query**|**sex**  <br>*optional*|性别|integer (int32)|
|**Query**|**username**  <br>*optional*|用户名|string|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[Result](#result)|
|**201**|Created|No Content|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Consumes

* `application/json`


#### Produces

* `*/*`


#### Tags

* user-controller


#### Security

|Type|Name|Scopes|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|



