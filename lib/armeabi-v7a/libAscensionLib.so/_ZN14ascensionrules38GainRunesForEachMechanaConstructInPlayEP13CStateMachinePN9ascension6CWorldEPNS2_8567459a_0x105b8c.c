// 函数: _ZN14ascensionrules38GainRunesForEachMechanaConstructInPlayEP13CStateMachinePN9ascension6CWorldEPNS2_7CPlayerEjPN4core9CInstanceEPNS2_19CEffectInstanceDataEPNS2_6CEventE
// 地址: 0x105b8c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
int32_t result = ascension::CPlayer::CountConstructsInPlay(arg3, true, nullptr)

if (result s< 1)
    return result

core::CInstance* r6_1 = result * arg4
ascension::CWorld::OutputAnimationRune(arg2, r6_1, arg5)
ascension::CWorld::AddCurrentTurnRunes(arg2)
return core::CWorldBase::OutputMessageFormat(arg2, "%s gains %d runes\n", (*(*arg3 + 0xc))(arg3), 
    r6_1) __tailcall
