/*
 * Copyright 2025 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/apps/card/v1/card.proto

// Protobuf Java Version: 3.25.5
package com.google.apps.card.v1;

public interface DecoratedTextOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.apps.card.v1.DecoratedText)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Deprecated in favor of `startIcon`.
   * </pre>
   *
   * <code>.google.apps.card.v1.Icon icon = 1 [deprecated = true];</code>
   *
   * @deprecated google.apps.card.v1.DecoratedText.icon is deprecated. See
   *     google/apps/card/v1/card.proto;l=796
   * @return Whether the icon field is set.
   */
  @java.lang.Deprecated
  boolean hasIcon();

  /**
   *
   *
   * <pre>
   * Deprecated in favor of `startIcon`.
   * </pre>
   *
   * <code>.google.apps.card.v1.Icon icon = 1 [deprecated = true];</code>
   *
   * @deprecated google.apps.card.v1.DecoratedText.icon is deprecated. See
   *     google/apps/card/v1/card.proto;l=796
   * @return The icon.
   */
  @java.lang.Deprecated
  com.google.apps.card.v1.Icon getIcon();

  /**
   *
   *
   * <pre>
   * Deprecated in favor of `startIcon`.
   * </pre>
   *
   * <code>.google.apps.card.v1.Icon icon = 1 [deprecated = true];</code>
   */
  @java.lang.Deprecated
  com.google.apps.card.v1.IconOrBuilder getIconOrBuilder();

  /**
   *
   *
   * <pre>
   * The icon displayed in front of the text.
   * </pre>
   *
   * <code>.google.apps.card.v1.Icon start_icon = 12;</code>
   *
   * @return Whether the startIcon field is set.
   */
  boolean hasStartIcon();

  /**
   *
   *
   * <pre>
   * The icon displayed in front of the text.
   * </pre>
   *
   * <code>.google.apps.card.v1.Icon start_icon = 12;</code>
   *
   * @return The startIcon.
   */
  com.google.apps.card.v1.Icon getStartIcon();

  /**
   *
   *
   * <pre>
   * The icon displayed in front of the text.
   * </pre>
   *
   * <code>.google.apps.card.v1.Icon start_icon = 12;</code>
   */
  com.google.apps.card.v1.IconOrBuilder getStartIconOrBuilder();

  /**
   *
   *
   * <pre>
   * The text that appears above `text`. Always truncates.
   * </pre>
   *
   * <code>string top_label = 3;</code>
   *
   * @return The topLabel.
   */
  java.lang.String getTopLabel();

  /**
   *
   *
   * <pre>
   * The text that appears above `text`. Always truncates.
   * </pre>
   *
   * <code>string top_label = 3;</code>
   *
   * @return The bytes for topLabel.
   */
  com.google.protobuf.ByteString getTopLabelBytes();

  /**
   *
   *
   * <pre>
   * Required. The primary text.
   *
   * Supports simple formatting. For more information
   * about formatting text, see
   * [Formatting text in Google Chat
   * apps](https://developers.google.com/workspace/chat/format-messages#card-formatting)
   * and
   * [Formatting
   * text in Google Workspace
   * Add-ons](https://developers.google.com/apps-script/add-ons/concepts/widgets#text_formatting).
   * </pre>
   *
   * <code>string text = 4;</code>
   *
   * @return The text.
   */
  java.lang.String getText();

  /**
   *
   *
   * <pre>
   * Required. The primary text.
   *
   * Supports simple formatting. For more information
   * about formatting text, see
   * [Formatting text in Google Chat
   * apps](https://developers.google.com/workspace/chat/format-messages#card-formatting)
   * and
   * [Formatting
   * text in Google Workspace
   * Add-ons](https://developers.google.com/apps-script/add-ons/concepts/widgets#text_formatting).
   * </pre>
   *
   * <code>string text = 4;</code>
   *
   * @return The bytes for text.
   */
  com.google.protobuf.ByteString getTextBytes();

  /**
   *
   *
   * <pre>
   * The wrap text setting. If `true`, the text wraps and displays on
   * multiple lines. Otherwise, the text is truncated.
   *
   * Only applies to `text`, not `topLabel` and `bottomLabel`.
   * </pre>
   *
   * <code>bool wrap_text = 5;</code>
   *
   * @return The wrapText.
   */
  boolean getWrapText();

  /**
   *
   *
   * <pre>
   * The text that appears below `text`. Always wraps.
   * </pre>
   *
   * <code>string bottom_label = 6;</code>
   *
   * @return The bottomLabel.
   */
  java.lang.String getBottomLabel();

  /**
   *
   *
   * <pre>
   * The text that appears below `text`. Always wraps.
   * </pre>
   *
   * <code>string bottom_label = 6;</code>
   *
   * @return The bytes for bottomLabel.
   */
  com.google.protobuf.ByteString getBottomLabelBytes();

  /**
   *
   *
   * <pre>
   * This action is triggered when users click `topLabel` or `bottomLabel`.
   * </pre>
   *
   * <code>.google.apps.card.v1.OnClick on_click = 7;</code>
   *
   * @return Whether the onClick field is set.
   */
  boolean hasOnClick();

  /**
   *
   *
   * <pre>
   * This action is triggered when users click `topLabel` or `bottomLabel`.
   * </pre>
   *
   * <code>.google.apps.card.v1.OnClick on_click = 7;</code>
   *
   * @return The onClick.
   */
  com.google.apps.card.v1.OnClick getOnClick();

  /**
   *
   *
   * <pre>
   * This action is triggered when users click `topLabel` or `bottomLabel`.
   * </pre>
   *
   * <code>.google.apps.card.v1.OnClick on_click = 7;</code>
   */
  com.google.apps.card.v1.OnClickOrBuilder getOnClickOrBuilder();

  /**
   *
   *
   * <pre>
   * A button that a user can click to trigger an action.
   * </pre>
   *
   * <code>.google.apps.card.v1.Button button = 8;</code>
   *
   * @return Whether the button field is set.
   */
  boolean hasButton();

  /**
   *
   *
   * <pre>
   * A button that a user can click to trigger an action.
   * </pre>
   *
   * <code>.google.apps.card.v1.Button button = 8;</code>
   *
   * @return The button.
   */
  com.google.apps.card.v1.Button getButton();

  /**
   *
   *
   * <pre>
   * A button that a user can click to trigger an action.
   * </pre>
   *
   * <code>.google.apps.card.v1.Button button = 8;</code>
   */
  com.google.apps.card.v1.ButtonOrBuilder getButtonOrBuilder();

  /**
   *
   *
   * <pre>
   * A switch widget that a user can click to change its state and trigger an
   * action.
   * </pre>
   *
   * <code>.google.apps.card.v1.DecoratedText.SwitchControl switch_control = 9;</code>
   *
   * @return Whether the switchControl field is set.
   */
  boolean hasSwitchControl();

  /**
   *
   *
   * <pre>
   * A switch widget that a user can click to change its state and trigger an
   * action.
   * </pre>
   *
   * <code>.google.apps.card.v1.DecoratedText.SwitchControl switch_control = 9;</code>
   *
   * @return The switchControl.
   */
  com.google.apps.card.v1.DecoratedText.SwitchControl getSwitchControl();

  /**
   *
   *
   * <pre>
   * A switch widget that a user can click to change its state and trigger an
   * action.
   * </pre>
   *
   * <code>.google.apps.card.v1.DecoratedText.SwitchControl switch_control = 9;</code>
   */
  com.google.apps.card.v1.DecoratedText.SwitchControlOrBuilder getSwitchControlOrBuilder();

  /**
   *
   *
   * <pre>
   * An icon displayed after the text.
   *
   * Supports
   * [built-in](https://developers.google.com/workspace/chat/format-messages#builtinicons)
   * and
   * [custom](https://developers.google.com/workspace/chat/format-messages#customicons)
   * icons.
   * </pre>
   *
   * <code>.google.apps.card.v1.Icon end_icon = 11;</code>
   *
   * @return Whether the endIcon field is set.
   */
  boolean hasEndIcon();

  /**
   *
   *
   * <pre>
   * An icon displayed after the text.
   *
   * Supports
   * [built-in](https://developers.google.com/workspace/chat/format-messages#builtinicons)
   * and
   * [custom](https://developers.google.com/workspace/chat/format-messages#customicons)
   * icons.
   * </pre>
   *
   * <code>.google.apps.card.v1.Icon end_icon = 11;</code>
   *
   * @return The endIcon.
   */
  com.google.apps.card.v1.Icon getEndIcon();

  /**
   *
   *
   * <pre>
   * An icon displayed after the text.
   *
   * Supports
   * [built-in](https://developers.google.com/workspace/chat/format-messages#builtinicons)
   * and
   * [custom](https://developers.google.com/workspace/chat/format-messages#customicons)
   * icons.
   * </pre>
   *
   * <code>.google.apps.card.v1.Icon end_icon = 11;</code>
   */
  com.google.apps.card.v1.IconOrBuilder getEndIconOrBuilder();

  com.google.apps.card.v1.DecoratedText.ControlCase getControlCase();
}
