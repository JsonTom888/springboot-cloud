package com.example.springbootcloud;

import com.example.FirstClass;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * 自定义自动装配实现类，返回需要自动注入的类
 *
 * @author tom
 * @version V1.0
 * @date 2021/4/5 15:41
 */
public class GpImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        return new String[]{FirstClass.class.getName(),SecondClass.class.getName()};
    }
}
