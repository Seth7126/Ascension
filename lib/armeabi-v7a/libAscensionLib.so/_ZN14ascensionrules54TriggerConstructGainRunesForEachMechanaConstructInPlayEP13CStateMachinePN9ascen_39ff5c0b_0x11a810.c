// 函数: _ZN14ascensionrules54TriggerConstructGainRunesForEachMechanaConstructInPlayEP13CStateMachinePN9ascension21CActiveEffectInstanceEPN4core9CInstanceEPNS2_6CEventEj
// 地址: 0x11a810
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* r6 = *(arg3 + 0xc)
int32_t r0_1 = ascension::CPlayer::CountConstructsInPlay(r6, true, nullptr)
int32_t r7 = r6[1]
core::CInstance* r5 = r0_1 * arg5
ascension::CWorld::OutputAnimationRune(r7, r5, arg3)
ascension::CWorld::AddCurrentTurnRunes(r7)
return core::CWorldBase::OutputMessageFormat(r7, "%s gains %d runes from %s\n", (*(*r6 + 0xc))(r6), 
    r5, (*(*arg3 + 0xc))(arg3))
