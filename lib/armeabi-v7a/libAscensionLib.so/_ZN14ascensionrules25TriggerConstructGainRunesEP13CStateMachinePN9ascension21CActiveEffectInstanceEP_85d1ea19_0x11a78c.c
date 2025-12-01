// 函数: _ZN14ascensionrules25TriggerConstructGainRunesEP13CStateMachinePN9ascension21CActiveEffectInstanceEPN4core9CInstanceEPNS2_6CEventEj
// 地址: 0x11a78c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* r7 = *(arg3 + 0xc)
int32_t r5 = r7[1]
ascension::CWorld::OutputAnimationRune(r5, arg5, arg3)
ascension::CWorld::AddCurrentTurnRunes(r5)
return core::CWorldBase::OutputMessageFormat(r5, "%s gains %d runes from %s\n", (*(*r7 + 0xc))(r7), 
    arg5, (*(*arg3 + 0xc))(arg3))
