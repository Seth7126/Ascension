// 函数: _ZN14ascensionrules38GainEnergyForEachTypeOfConstructInPlayEP13CStateMachinePN9ascension6CWorldEPNS2_7CPlayerEjPN4core9CInstanceEPNS2_19CEffectInstanceDataEPNS2_6CEventE
// 地址: 0x1068a8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0_1 = ascension::CPlayer::CountConstructsInPlay(arg3, true, nullptr)
int32_t r0_3 = ascension::CPlayer::CountConstructsInPlay(arg3, true, nullptr)
core::CInstance* r6_1 = nullptr

if (r0_1 s> 0)
    r6_1 = 1

if (r0_3 s> 0)
    r6_1 += 1

if (ascension::CPlayer::CountConstructsInPlay(arg3, true, nullptr) s> 0)
    r6_1 += 1

if (ascension::CPlayer::CountConstructsInPlay(arg3, true, nullptr) s> 0)
    r6_1 += 1

ascension::CWorld::OutputAnimationEnergy(arg2, r6_1, arg5)
ascension::CWorld::AddCurrentTurnEnergy(arg2)
return core::CWorldBase::OutputMessageFormat(arg2, "%s gains %d energy\n", (*(*arg3 + 0xc))(arg3), 
    r6_1) __tailcall
