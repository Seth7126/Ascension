// 函数: _ZN9ascension13AddEffectFuncEPKcPFvP13CStateMachinePNS_6CWorldEPNS_7CPlayerEjPN4core9CInstanceEPNS_19CEffectInstanceDataEPNS_6CEventEE
// 地址: 0xe7f1c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r2 = *__stack_chk_guard
void (** r3)(CStateMachine*, ascension::CWorld*, ascension::CPlayer*, uint32_t, core::CInstance*, 
    ascension::CEffectInstanceData*, ascension::CEvent*) = *(ascension::s_EffectFuncList + 4)

if (r3 == *(ascension::s_EffectFuncList + 8))
    std::__ndk1::vector<ascension::EffectFuncEntry, std::__ndk1::allocator<ascension::EffectFuncEntry> >::__push_back_slow_path<ascension::EffectFuncEntry const&>(
        ascension::s_EffectFuncList)
else
    *r3 = arg1
    r3[1] = arg2
    *(ascension::s_EffectFuncList + 4) += 8

int32_t r0_4 = *__stack_chk_guard

if (r0_4 == r2)
    return r0_4 - r2

__stack_chk_fail()
noreturn
