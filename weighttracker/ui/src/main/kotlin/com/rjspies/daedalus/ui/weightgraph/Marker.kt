package com.rjspies.daedalus.ui.weightgraph

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.unit.dp
import com.patrykandpatrick.vico.compose.component.lineComponent
import com.patrykandpatrick.vico.compose.component.shapeComponent
import com.patrykandpatrick.vico.compose.component.textComponent
import com.patrykandpatrick.vico.compose.dimensions.dimensionsOf
import com.patrykandpatrick.vico.core.chart.dimensions.HorizontalDimensions
import com.patrykandpatrick.vico.core.chart.insets.Insets
import com.patrykandpatrick.vico.core.component.marker.MarkerComponent
import com.patrykandpatrick.vico.core.component.shape.DashedShape
import com.patrykandpatrick.vico.core.component.shape.Shapes
import com.patrykandpatrick.vico.core.component.shape.cornered.Corner
import com.patrykandpatrick.vico.core.component.shape.cornered.MarkerCorneredShape
import com.patrykandpatrick.vico.core.context.MeasureContext
import com.patrykandpatrick.vico.core.marker.Marker

@Composable
internal fun rememberMarker(): Marker {
    val indicator = shapeComponent(
        shape = Shapes.pillShape,
        color = MaterialTheme.colorScheme.primary,
    )

    val labelBackground = shapeComponent(
        shape = MarkerCorneredShape(Corner.FullyRounded),
        color = MaterialTheme.colorScheme.primary,
    )

    val label = textComponent(
        background = labelBackground,
        lineCount = LabelLineCount,
        padding = LabelPadding,
        color = MaterialTheme.colorScheme.onPrimary,
    )

    val guideline = lineComponent(
        thickness = GuidelineThickness,
        shape = GuidelineShape,
        color = MaterialTheme.colorScheme.primary,
    )

    return remember(label, indicator, guideline) {
        object : MarkerComponent(label, indicator, guideline) {
            init {
                labelFormatter = DaedalusMarkerLabelFormatter
                indicatorSizeDp = IndicatorSizeDp
            }

            override fun getInsets(
                context: MeasureContext,
                outInsets: Insets,
                horizontalDimensions: HorizontalDimensions,
            ) = with(context) {
                outInsets.top = label.getHeight(context) +
                    LabelBackgroundShape.tickSizeDp.pixels +
                    (LabelBackgroundShadowRadius.pixels * ShadowRadiusMultiplier) -
                    LabelBackgroundShadowDy.pixels
            }
        }
    }
}

private const val LabelBackgroundShadowRadius = 4f
private const val LabelBackgroundShadowDy = 2f
private const val LabelLineCount = 1
private const val IndicatorSizeDp = 12f
private const val GuidelineDashLengthDp = 8f
private const val GuidelineGapLengthDp = 4f
private const val ShadowRadiusMultiplier = 1.3f

private val LabelBackgroundShape = MarkerCorneredShape(Corner.FullyRounded)
private val LabelPadding = dimensionsOf(8.dp, 4.dp)
private val GuidelineThickness = 2.dp
private val GuidelineShape = DashedShape(Shapes.pillShape, GuidelineDashLengthDp, GuidelineGapLengthDp)
