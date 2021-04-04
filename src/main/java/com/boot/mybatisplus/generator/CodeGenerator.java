package com.boot.mybatisplus.generator;

import com.baomidou.mybatisplus.core.toolkit.StringPool;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @PackageName: com.boot.mybatisplus.generator
 * @ClassName: CodeGenerator
 * @Description: This is CodeGenerator class by Skwen.
 * @Author: Skwen
 * @Date: 2021-04-04 16:24
 */
@Component
public class CodeGenerator {
    private static final String parent = "com.boot.mybatisplus";
    private static final String tableName = "t_user";
    private static final String author = "skwen";
    private static final String database = "mybatis_plus";
    private static final String username = "root";
    private static final String password = "qq19971102";

    public static void main(String[] args) throws IOException {
        AutoGenerator autoGenerator = new AutoGenerator();
        String defaultName = captureName(tableName.replace("t_", ""));
        GlobalConfig globalConfig = new GlobalConfig();
        String projectPath = new File("").getCanonicalPath();
        globalConfig.setOutputDir(projectPath + "/src/main/java");
        globalConfig.setAuthor(author);
        globalConfig.setOpen(false);
        globalConfig.setBaseColumnList(true);
        globalConfig.setBaseResultMap(true);
        //生成service名称
        globalConfig.setFileOverride(true);
        globalConfig.setControllerName(defaultName + "Controller");
        globalConfig.setMapperName(defaultName + "Dao");
        globalConfig.setEntityName(defaultName);
        globalConfig.setServiceName(defaultName + "Service");
        globalConfig.setServiceImplName(defaultName + "ServiceImpl");
        globalConfig.setXmlName(defaultName + "Mapper");
        autoGenerator.setGlobalConfig(globalConfig);

        // 数据源配置
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setUrl("jdbc:mysql://127.0.0.1:3306/" + database + "?useUnicode=true&useSSL=false&characterEncoding=utf8");
        dataSourceConfig.setDriverName("com.mysql.jdbc.Driver");
        dataSourceConfig.setUsername(username);
        dataSourceConfig.setPassword(password);
        autoGenerator.setDataSource(dataSourceConfig);

        // 包配置
        PackageConfig packageConfig = new PackageConfig();
        packageConfig.setParent(parent);
        packageConfig.setController("controller");
        packageConfig.setMapper("dao");
        packageConfig.setService("service");
        packageConfig.setServiceImpl("service.impl");
        packageConfig.setEntity("entity");
        autoGenerator.setPackageInfo(packageConfig);

        // 自定义配置
        InjectionConfig cfg = new InjectionConfig() {
            @Override
            public void initMap() {
                // to do nothing
            }
        };

        // 如果模板引擎是 freemarker
        //String templatePath = "/templates/mapper.xml.ftl";
        // 如果模板引擎是 velocity
        String templatePath = "/templates/mapper.xml.vm";

        // 自定义输出配置
        List<FileOutConfig> focList = new ArrayList<>();
        // 自定义配置会被优先输出
        focList.add(new FileOutConfig(templatePath) {
            @Override
            public String outputFile(TableInfo tableInfo) {
                // 自定义输出文件名 ， 如果你 Entity 设置了前后缀、此处注意 xml 的名称会跟着发生变化！！
                return projectPath + "/src/main/resources/mapper/" + defaultName + "Mapper" + StringPool.DOT_XML;
            }
        });
        cfg.setFileOutConfigList(focList);
        autoGenerator.setCfg(cfg);
        // 配置模板
        TemplateConfig templateConfig = new TemplateConfig();

        // 配置自定义输出模板
        //指定自定义模板路径，注意不要带上.ftl/.vm, 会根据使用的模板引擎自动识别
        // templateConfig.setEntity("templates/entity2.java");
        // templateConfig.setService();
        // templateConfig.setController();

        templateConfig.setXml(null);
        autoGenerator.setTemplate(templateConfig);

        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        strategy.setNaming(NamingStrategy.underline_to_camel);
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
        strategy.setEntityLombokModel(true);
        strategy.setEntityTableFieldAnnotationEnable(true);
        //实体类是否为链式模型  @Accessors(chain = true)
        strategy.setChainModel(true);
        strategy.setRestControllerStyle(true);
        strategy.setInclude(tableName.split(","));
        strategy.setControllerMappingHyphenStyle(true);
        strategy.setCapitalMode(true);
        autoGenerator.setStrategy(strategy);

        autoGenerator.execute();
    }

    private static String captureName(String str) {
        // 进行字母的ascii编码前移，效率要高于截取字符串进行转换的操作
        char[] cs = str.toCharArray();
        cs[0] -= 32;
        return String.valueOf(cs);
    }
}
