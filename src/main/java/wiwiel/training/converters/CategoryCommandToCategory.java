package wiwiel.training.converters;


import wiwiel.training.commands.CategoryCommand;
import wiwiel.training.domain.Category;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class CategoryCommandToCategory implements Converter<CategoryCommand, Category>{

    @Synchronized
    @Nullable
    @Override
    public Category convert(CategoryCommand source) {
        if (source == null) {
            return null;
        }

        final Category category = new Category();
        category.setId(source.getId());
        category.setDescription(source.getDescription());
        return category;
    }
}
