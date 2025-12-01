// 函数: _ZN14ascensionrules27CStateTransformCardFromHand9ExitStateER13CStateMachine
// 地址: 0x16a204
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

core::CCardInstance* r0_1 = *(*(arg1 + 0x38) + 4)

if (*(*(r0_1 + 0xbdc) - 8) == *(arg1 + 0x3c))
    ascension::CWorld::PopResolveEffect(r0_1)

return CStateList::ExitState(arg1) __tailcall
