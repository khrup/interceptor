package spring.basic.processor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.thymeleaf.context.ITemplateContext;
import org.thymeleaf.engine.AttributeName;
import org.thymeleaf.model.IProcessableElementTag;
import org.thymeleaf.processor.element.IElementTagStructureHandler;
import org.thymeleaf.standard.processor.AbstractStandardExpressionAttributeTagProcessor;
import org.thymeleaf.templatemode.TemplateMode;

@Component
@Slf4j
public class CustomProcessor extends AbstractStandardExpressionAttributeTagProcessor {


    protected CustomProcessor() {
        super(TemplateMode.HTML, "tx", "hi", 1000, true);
    }

    @Override
    protected void doProcess(ITemplateContext context, IProcessableElementTag tag, AttributeName attributeName, String attributeValue, Object expressionResult, IElementTagStructureHandler structureHandler) {
//      log.info("context = {}", context);
      log.info("tag = {}", tag);
      log.info("tag.getAttributeMap = {}", tag.getAttributeMap());
      log.info("tag.getAllAttributes = {}", tag.getAllAttributes());
      log.info("attributeName = {}", attributeName);
      log.info("attributeName.getAttributeName = {}", attributeName.getAttributeName());
      log.info("attributeValue = {}", attributeValue);
      log.info("expressionResult = {}", expressionResult);
//      log.info("structureHandler = {}", structureHandler);
        structureHandler.setBody("1231234444", true);
    }
}
