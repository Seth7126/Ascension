// 函数: __cxa_call_unexpected
// 地址: 0x19cd58
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

char* var_18 = arg3
int32_t var_20 = arg2

if (arg1 == 0)
    sub_19ccf4(0, arg1)
    noreturn

__cxa_begin_catch(arg1)
int32_t r8 = ((*arg1 & 0xffffff00) ^ 0x432b2b00) | (*(arg1 + 4) ^ 0x434c4e47)
int32_t var_34
int32_t var_30
void* var_28
int32_t r0_3
void* r10

if (r8 != 0)
    var_30 = std::get_terminate()
    r10 = nullptr
    r0_3 = std::get_unexpected()
else
    arg2 = *(arg1 + 0x34)
    r10 = arg1 - 0x28
    r0_3 = *(arg1 - 0x1c)
    arg3 = *(arg1 + 0x2c)
    var_30 = *(arg1 - 0x18)
    var_28 = arg3
    var_34 = arg2 s>> 0x1f

__cxa_begin_catch(sub_19c77c(r0_3))

if (r8 != 0)
    __cxa_end_catch()
else
    var_28 = &arg3[1]
    sub_19cee8(&var_28, zx.d(*arg3))
    char* r0_8 = var_28
    var_28 = &r0_8[1]
    
    if (zx.d(*r0_8) != 0xff)
        int32_t r0_11 = sub_19cf90(&var_28)
        void* r11 = var_28
        int32_t* r0_12 = __cxa_get_globals_fast()
        int32_t* r8_1 = *r0_12
        
        if (r8_1 != 0)
            void* r11_1 = r11 + r0_11
            
            if (r8_1 != r10)
                int32_t r0_15 = r8_1[0xa]
                int32_t r1_9 = r8_1[0xb] ^ 0x434c4e47
                
                if ((((r0_15 & 0xffffff00) ^ 0x432b2b00) | r1_9) == 0)
                    void* r0_18
                    
                    if (((r0_15 ^ 0x432b2b01) | r1_9) != 0)
                        r0_18 = &r8_1[0x20]
                    else
                        r0_18 = *r8_1
                    
                    if (sub_19cfb8(arg2, var_34, r11_1, r8_1[1], r0_18, arg1) == 0)
                        r8_1[6] = 0 - r8_1[6]
                        int32_t r0_28 = r0_12[1] + 1
                        r0_12[1] = r0_28
                        __cxa_end_catch(r0_28)
                        __cxa_end_catch()
                        __cxa_begin_catch(&r8_1[0xa])
                        __cxa_rethrow()
                        noreturn
            
            void* __offset(vtable_for_std::bad_exception, 0x8) var_2c =
                _vtable_for_std::bad_exception + 8
            
            if (sub_19cfb8(arg2, var_34, r11_1, _typeinfo_for_std::bad_exception, &var_2c, arg1)
                    == 0)
                __cxa_end_catch()
                void** r0_24 = __cxa_allocate_exception(4)
                *r0_24 = _vtable_for_std::bad_exception + 8
                __cxa_throw(r0_24, _typeinfo_for_std::bad_exception, 
                    std::bad_exception::~bad_exception)
                noreturn
            
            std::bad_exception::~bad_exception()
            __cxa_end_catch()

sub_19c7bc(var_30)
noreturn
