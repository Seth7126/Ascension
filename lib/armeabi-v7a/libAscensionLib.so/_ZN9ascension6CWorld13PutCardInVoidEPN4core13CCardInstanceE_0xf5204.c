// 函数: _ZN9ascension6CWorld13PutCardInVoidEPN4core13CCardInstanceE
// 地址: 0xf5204
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
int32_t r2 = *__stack_chk_guard
void* entry_r1
void* var_18 = entry_r1
void* r2_1 = *(entry_r1 + 0xc)
core::CCardInstance* r0

if (zx.d(*(r2_1 + 0xd1)) == 0)
    if (*(r2_1 + 0x88) != 5)
        if (zx.d(*(r2_1 + 0xc8)) != 0 && (*(r2_1 + 0x8c) == 0 || *(arg1 + 0x30) u> 0x16))
            goto label_f52c8
        
        r0 = *(arg1 + 0xa4c)
        goto label_f52a8
    
    void** r2_3 = *(arg1 + 0xa54)
    
    if (r2_3 == *(arg1 + 0xa58))
        std::__ndk1::vector<core::CCardInstance*, std::__ndk1::allocator<core::CCardInstance*> >::__push_back_slow_path<core::CCardInstance* const&>(
            arg1 + 0xa50)
    else
        *r2_3 = entry_r1
        *(arg1 + 0xa54) += 4
    
    goto label_f52c8

if (zx.d(*(r2_1 + 0xc8)) != 0)
label_f52c8:
    int32_t r0_3 = *__stack_chk_guard
    
    if (r0_3 == r2)
        return r0_3 - r2
else
    r0 = *(arg1 + 0xa64)
label_f52a8:
    
    if (*__stack_chk_guard == r2)
        return core::CCardStack::AddCard(r0) __tailcall

__stack_chk_fail()
noreturn
