// 函数: _ZN14ascensionrules37GainHonorForEachTypeOfConstructInPlayEP13CStateMachinePN9ascension6CWorldEPNS2_7CPlayerEjPN4core9CInstanceEPNS2_19CEffectInstanceDataEPNS2_6CEventE
// 地址: 0x107354
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

uint32_t r6 = 0
int32_t r0_1 = ascension::CPlayer::CountConstructsInPlay(arg3, true, nullptr)
int32_t r0_3 = ascension::CPlayer::CountConstructsInPlay(arg3, true, nullptr)
int32_t r0_5 = ascension::CPlayer::CountConstructsInPlay(arg3, true, nullptr)
int32_t r0_7 = ascension::CPlayer::CountConstructsInPlay(arg3, true, nullptr)
ascension::CWorld* r1 = arg5

if (r0_1 s> 0)
    r6 = 1

if (r0_3 s> 0)
    r6 += 1

if (r0_5 s> 0)
    r6 += 1

if (r0_7 s> 0)
    r6 += 1

return ascensionrules::GainHonor(arg1, r1, arg3, r6, r1)
