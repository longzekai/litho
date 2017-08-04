/*
 * Copyright (c) 2017-present, Facebook, Inc.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 */

package com.facebook.litho.specmodels.model;

import com.facebook.litho.specmodels.generator.TypeSpecDataHolder;
import com.squareup.javapoet.MethodSpec;
import java.util.List;

/**
 * An interface for generating certain methods that are required in order for Dependency
 * Injection to work.
 */
public interface DependencyInjectionHelper {

  /**
   * Validate that the dependency injection for this spec is correctly defined.
   */
  List<SpecModelValidationError> validate(SpecModel specModel);

  /**
   * Generate code required to make the Dependency Injection work.
   */
  TypeSpecDataHolder generate(SpecModel specModel);

  /** Generate source delegate required for Dependency Injection. */
  TypeSpecDataHolder generateSourceDelegate(SpecModel specModel);

  /** Generate the constructor required for Dependency Injection. */
  MethodSpec generateConstructor(SpecModel specModel);
}
