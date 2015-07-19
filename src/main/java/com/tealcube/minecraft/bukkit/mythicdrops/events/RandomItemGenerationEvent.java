package com.tealcube.minecraft.bukkit.mythicdrops.events;

/*
 * #%L
 * MythicDrops
 * %%
 * Copyright (C) 2013 - 2015 TealCube
 * %%
 * Permission to use, copy, modify, and/or distribute this software for any purpose with or without fee is hereby
 * granted,
 * provided that the above copyright notice and this permission notice appear in all copies.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS" AND THE AUTHOR DISCLAIMS ALL WARRANTIES WITH REGARD TO THIS SOFTWARE INCLUDING ALL
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS. IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY SPECIAL, DIRECT,
 * INDIRECT, OR CONSEQUENTIAL DAMAGES OR ANY DAMAGES WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS, WHETHER
 * IN AN
 * ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS ACTION, ARISING OUT OF OR IN CONNECTION WITH THE USE OR
 * PERFORMANCE OF
 * THIS SOFTWARE.
 * #L%
 */


import com.tealcube.minecraft.bukkit.mythicdrops.api.events.MythicDropsCancellableEvent;
import com.tealcube.minecraft.bukkit.mythicdrops.api.items.ItemGenerationReason;
import com.tealcube.minecraft.bukkit.mythicdrops.api.tiers.Tier;
import org.bukkit.inventory.ItemStack;

public class RandomItemGenerationEvent extends MythicDropsCancellableEvent {

    private Tier tier;
    private ItemStack itemStack;
    private ItemGenerationReason reason;
    private boolean modified;

    public RandomItemGenerationEvent(Tier tier, ItemStack itemStack, ItemGenerationReason reason) {
        this.tier = tier;
        this.itemStack = itemStack;
        this.reason = reason;
        modified = false;
    }

    public Tier getTier() {
        return tier;
    }

    public ItemStack getItemStack() {
        return itemStack;
    }

    public void setItemStack(ItemStack itemStack) {
        setItemStack(itemStack, true);
    }

    public void setItemStack(ItemStack itemStack, boolean modified) {
        this.itemStack = itemStack;
        if (modified) {
            this.modified = true;
        }
    }

    public ItemGenerationReason getReason() {
        return reason;
    }

    public boolean isModified() {
        return modified;
    }
}
