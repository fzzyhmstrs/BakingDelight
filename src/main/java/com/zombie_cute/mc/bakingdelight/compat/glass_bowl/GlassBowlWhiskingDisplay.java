package com.zombie_cute.mc.bakingdelight.compat.glass_bowl;

import com.google.common.collect.ImmutableList;
import com.zombie_cute.mc.bakingdelight.recipe.WhiskingRecipe;
import me.shedaniel.rei.api.common.category.CategoryIdentifier;
import me.shedaniel.rei.api.common.display.basic.BasicDisplay;
import me.shedaniel.rei.api.common.entry.EntryIngredient;
import me.shedaniel.rei.api.common.util.EntryIngredients;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class GlassBowlWhiskingDisplay extends BasicDisplay {
    public GlassBowlWhiskingDisplay(WhiskingRecipe recipe){
        super(EntryIngredients.ofIngredients(recipe.getIngredients()),
                Collections.singletonList(EntryIngredients.of(recipe.getOutput(null))),
                Optional.ofNullable(recipe.getId()));
    }

    @Override
    public List<EntryIngredient> getInputEntries() {
        List<EntryIngredient> inputEntryList = new ArrayList<>(super.getInputEntries());

        return ImmutableList.copyOf(inputEntryList);
    }

    @Override
    public CategoryIdentifier<?> getCategoryIdentifier() {
        return GlassBowlWhiskingCategory.WHISKING;
    }
}
