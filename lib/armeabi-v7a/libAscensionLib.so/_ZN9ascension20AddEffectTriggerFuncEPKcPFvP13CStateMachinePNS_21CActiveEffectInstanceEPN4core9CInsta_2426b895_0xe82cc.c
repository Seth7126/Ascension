// 函数: _ZN9ascension20AddEffectTriggerFuncEPKcPFvP13CStateMachinePNS_21CActiveEffectInstanceEPN4core9CInstanceEPNS_6CEventEjE
// 地址: 0xe82cc
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r2 = *__stack_chk_guard
void (** r3)(CStateMachine*, ascension::CActiveEffectInstance*, core::CInstance*, 
    ascension::CEvent*, uint32_t) = *(ascension::s_EffectTriggerFuncList + 4)

if (r3 == *(ascension::s_EffectTriggerFuncList + 8))
    std::__ndk1::vector<ascension::EffectTriggerFuncEntry, std::__ndk1::allocator<ascension::EffectTriggerFuncEntry> >::__push_back_slow_path<ascension::EffectTriggerFuncEntry const&>(
        ascension::s_EffectTriggerFuncList)
else
    *r3 = arg1
    r3[1] = arg2
    *(ascension::s_EffectTriggerFuncList + 4) += 8

int32_t r0_4 = *__stack_chk_guard

if (r0_4 == r2)
    return r0_4 - r2

__stack_chk_fail()
noreturn
