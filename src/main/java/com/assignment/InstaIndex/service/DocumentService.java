/**
 * Copyright (c) 2026 V K Deewakar. All Rights Reserved.
 */
package com.assignment.InstaIndex.service;

import com.assignment.InstaIndex.model.Document;

import java.util.List;

public interface DocumentService {

    Document create(Document document);

    List<Document> fetchDocumentsByQuery(String query);
}
