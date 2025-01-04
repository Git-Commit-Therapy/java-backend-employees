package com.git_commit_therapy.emergency.utils;

import com.git_commit_therapy.employeeService.dao.SeverityCode;

import java.util.Comparator;
import java.util.List;
import java.util.Map;

/**
 * Interface for managing multiple queues, each identified by a unique token.
 *
 * @param <T> The type of items stored in the queues.
 * @param <K> The type of token used to identify each queue.
 */
public interface MultipleQueue<T, K> {

    /**
     * Pushes an item into the corresponding queue (identified by the token).
     *
     * @param item       The item to be added to the queue.
     * @param queueToken The token identifying the queue.
     */
    void push(T item, K queueToken);

    /**
     * Removes the specified item from the queue it belongs to.
     *
     * @param item The item to be removed from the queue.
     * @return The removed item if it exists, or {@code null} otherwise.
     */
    T pop(T item);

    /**
     * Retrieves an unmodifiable map containing all queues, where each key is a queue token
     *
     * @return A {@link Map} containing all queues and their items.
     */
    Map<K, List<T>> getAllQueues();

    /**
     * Retrieves an unmodifiable queue associated with the specified token.
     *
     * @param queueToken The token identifying the queue to retrieve.
     * @return A {@link List} containing the items in the specified queue,
     *         or {@code null} otherwise.
     */
    List<T> getQueue(K queueToken);

    /**
     * Sets a custom comparator to determine the ordering of items in all queues.
     * The default value is null
     *
     * @param comparator A {@link Comparator} defining the custom sorting logic for the items.
     */
    void setComparator(Comparator<T> comparator);

    /**
     * Checks if the specified item is present in any of the queues.
     *
     * @param item The item to be searched for across all queues.
     * @return {@code true} if the item is found in any of the queues, {@code false} otherwise.
     */
    boolean contains(T item);

    /**
     * Returns a map containing the size of each queue based on the severity of patients.
     * @return A Map where the key is a SeverityCode, and the value is the size of the corresponding queue.
     */
    Map<SeverityCode,Long> getSizeOfQueues();
}
