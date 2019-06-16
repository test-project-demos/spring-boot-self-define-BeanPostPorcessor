package com.example.springbootselfdefineBeanPostPorcessor

import org.slf4j.LoggerFactory
import org.springframework.beans.PropertyValues
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor
import org.springframework.context.annotation.Configuration
import java.beans.PropertyDescriptor

/**
 * @author zhixiao.mzx
 * @date 2019-06-16
 */
@Configuration
class MyInstantiationAwareBeanPostProcessor : InstantiationAwareBeanPostProcessor {
    private val logger = LoggerFactory.getLogger(MyInstantiationAwareBeanPostProcessor::class.java)

    override fun postProcessBeforeInitialization(bean: Any?, beanName: String?): Any {
        logger.warn("postProcessBeforeInitialization: $beanName")
        return bean!!
    }

    override fun postProcessAfterInstantiation(bean: Any?, beanName: String?): Boolean {
        logger.warn("postProcessAfterInstantiation: $beanName")
        return true
    }

    override fun postProcessAfterInitialization(bean: Any?, beanName: String?): Any {
        logger.warn("postProcessAfterInitialization: $beanName")
        return bean!!
    }

    override fun postProcessBeforeInstantiation(beanClass: Class<*>?, beanName: String?): Any? {
        logger.warn("postProcessBeforeInstantiation: $beanName")
        return null
    }

    override fun postProcessPropertyValues(
        pvs: PropertyValues?,
        pds: Array<out PropertyDescriptor>?,
        bean: Any?,
        beanName: String?
    ): PropertyValues {
        return pvs!!
    }

}