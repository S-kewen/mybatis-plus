# mybatis-plus
* 官網：https://baomidou.com/en/
* Mybatis：https://github.com/S-kwen/mybatis
### 什麼是Mybatis plus？

MyBatis-Plus（簡稱 MP）是一個 MyBatis的增強工具，在 MyBatis 的基礎上只做增強不做改變，為簡化開發、提高效率而生。

### 特征
* 無侵入：只做增強不做改變，引入它不會對現有工程產生影響，如絲般順滑
* 損耗小：啟動即會自動註入基本 CURD，性能基本無損耗，直接面向對象操作
* 強大的 CRUD 操作：內置通用 Mapper、通用 Service，僅僅通過少量配置即可實現單表大部分 CRUD 操作，更有強大的條件構造器，滿足各類使用需求
* 支持 Lambda 形式調用：通過 Lambda 表達式，方便的編寫各類查詢條件，無需再擔心字段寫錯
* 支持主鍵自動生成：支持多達 4 種主鍵策略（內含分布式唯一 ID 生成器 - Sequence），可自由配置，完美解決主鍵問題
* 支持 ActiveRecord 模式：支持 ActiveRecord 形式調用，實體類只需繼承 Model 類即可進行強大的 CRUD 操作
* 支持自定義全局通用操作：支持全局通用方法註入（ Write once, use anywhere ）
* 內置代碼生成器：采用代碼或者 Maven 插件可快速生成 Mapper 、 Model 、 Service 、 Controller 層代碼，支持模板引擎，更有超多自定義配置等您來使用
* 內置分頁插件：基於 MyBatis 物理分頁，開發者無需關心具體操作，配置好插件之後，寫分頁等同於普通 List 查詢
* 分頁插件支持多種數據庫：支持 MySQL、MariaDB、Oracle、DB2、H2、HSQL、SQLite、Postgre、SQLServer 等多種數據庫
* 內置性能分析插件：可輸出 Sql 語句以及其執行時間，建議開發測試時啟用該功能，能快速揪出慢查詢
* 內置全局攔截插件：提供全表 delete 、 update 操作智能分析阻斷，也可自定義攔截規則，預防誤操作

### 支持數據庫
任何能使用 mybatis 進行 crud, 並且支持標準 sql 的數據庫

### Mybatis plus 和 Mybatis有什麼區別？
MyBatis-plus是一款MyBatis的增強工具，在MyBatis 的基礎上只做增強不做改變。其是國內團隊苞米豆在MyBatis基礎上開發的增強框架，擴展了一些功能，以提高效率。引入 Mybatis-Plus 不會對現有的 Mybatis 構架產生任何影響，而且 MyBatis-plus 支持所有 Mybatis 原生的特性

1）依賴少：僅僅依賴 Mybatis 以及 Mybatis-Spring 。

2）損耗小：啟動即會自動註入基本 CURD，性能基本無損耗，直接面向對象操作 。

3）預防Sql註入：內置 Sql 註入剝離器，有效預防Sql註入攻擊 。

4）通用CRUD操作：內置通用 Mapper、通用 Service，僅僅通過少量配置即可實現單表大部分 CRUD 操作，更有強大的條件構造器，滿足各類使用需求 。

5）多種主鍵策略：支持多達4種主鍵策略（內含分布式唯一ID生成器），可自由配置，完美解決主鍵問題 。

6）支持熱加載：Mapper 對應的 XML 支持熱加載，對於簡單的 CRUD 操作，甚至可以無 XML 啟動

7）支持ActiveRecord：支持 ActiveRecord 形式調用，實體類只需繼承 Model 類即可實現基本 CRUD 操作

8）支持代碼生成：采用代碼或者 Maven 插件可快速生成 Mapper 、 Model 、 Service 、 Controller 層代碼（生成自定義文件，避免開發重復代碼），支持模板引擎、有超多自定義配置等。

9）支持自定義全局通用操作：支持全局通用方法註入（ Write once, use anywhere ）。

10）支持關鍵詞自動轉義：支持數據庫關鍵詞（order、key…）自動轉義，還可自定義關鍵詞 。

11）內置分頁插件：基於 Mybatis 物理分頁，開發者無需關心具體操作，配置好插件之後，寫分頁等同於普通List查詢。

12）內置性能分析插件：可輸出 Sql 語句以及其執行時間，建議開發測試時啟用該功能，能有效解決慢查詢 。

13）內置全局攔截插件：提供全表 delete 、 update 操作智能分析阻斷，預防誤操作。

14）默認將實體類的類名查找數據庫中的表，使用@TableName(value="table1")註解指定表名，@TableId指定表主鍵，若字段與表中字段名保持一致可不加註解。