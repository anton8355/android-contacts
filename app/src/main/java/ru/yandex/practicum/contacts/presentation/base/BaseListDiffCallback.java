package ru.yandex.practicum.contacts.presentation.base;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.DiffUtil;

public class BaseListDiffCallback<T extends ListDiffInterface<BaseListDiffCallback>> extends DiffUtil.ItemCallback<T> {


    public boolean theSameAs(T other) {
        return this.hashCode() == other.hashCode();
    }

    @Override
    public boolean areItemsTheSame(@NonNull T oldItem, @NonNull T newItem) {
        return false;
    }

    @Override
    public boolean areContentsTheSame(@NonNull T oldItem, @NonNull T newItem) {
        return oldItem.equals(newItem);
    }

    @Nullable
    @Override
    public Object getChangePayload(@NonNull T oldItem, @NonNull T newItem) {
        return newItem;
    }
}
