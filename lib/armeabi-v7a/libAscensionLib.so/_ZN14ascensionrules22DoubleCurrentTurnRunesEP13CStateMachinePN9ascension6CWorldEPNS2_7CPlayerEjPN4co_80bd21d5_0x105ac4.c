// 函数: _ZN14ascensionrules22DoubleCurrentTurnRunesEP13CStateMachinePN9ascension6CWorldEPNS2_7CPlayerEjPN4core9CInstanceEPNS2_19CEffectInstanceDataEPNS2_6CEventE
// 地址: 0x105ac4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

core::CInstance* r6 = *(arg2 + 0xb40)
ascension::CWorld::OutputAnimationRune(arg2, r6, arg5)
ascension::CWorld::AddCurrentTurnRunes(arg2)
return core::CWorldBase::OutputMessageFormat(arg2, "%s gains %d runes\n", (*(*arg3 + 0xc))(arg3), 
    r6) __tailcall
