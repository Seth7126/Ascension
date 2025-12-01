// 函数: _ZN14ascensionrules30CStateTransformConstructInPlay26SelectConstructToTransformER13CStateMachineP6CStateiPj
// 地址: 0x141508
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

uint32_t r6 = *(arg3 + 0x10)
core::CCardInstance* r7 = *(*(arg2 + 0x24c) + 4)
ascension::CWorld::PushResolveEffect(r7, r6)
int32_t var_20 = 0
ascension::CWorld::OutputAnimationCard(r7, r6, 1, 4, zx.d(*(arg3 + 8)), 0xb, 0, 0)
int32_t result = ascension::CWorld::OutputPauseForAnimationToDestination(r7)
*(arg2 + 0x254) = arg3
return result
