// 函数: _ZNK9ascension6CWorld21QueryCardFactionFlagsEPKNS_7CPlayerEPKN4core13CCardInstanceEj
// 地址: 0xf4040
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t result = 1
int32_t r0 = *__stack_chk_guard
int32_t entry_r3

if ((*(*(arg3 + 0xc) + 0x8c) & entry_r3) == 0)
    result = 0
    int32_t var_74_1 = 2
    int32_t var_70_1 = 0
    void* __offset(vtable_for_ascension::CEventQueryCardFaction, 0x8) var_78_1 =
        _vtable_for_ascension::CEventQueryCardFaction + 8
    core::CCardInstance const* var_2c_1 = arg2
    uint32_t var_28_1 = arg3
    int32_t var_24_1 = entry_r3
    char var_20_1 = 0
    ascension::CWorld** r7_1 = *(arg1 + 0xaa4)
    int32_t r1 = *(arg1 + 0xaa8)
    
    if (r7_1 != r1)
        do
            ascension::CWorld* r0_4 = *r7_1
            
            if ((zx.d(*(r0_4 + 0x148)) & 4) != 0)
                ascension::CActiveEffectInstance::HandleQuery(r0_4, arg1)
                r1 = *(arg1 + 0xaa8)
            
            r7_1 = &r7_1[1]
        while (r7_1 != r1)
        
        result = 0
    
    ascension::CEvent::~CEvent()

if (*__stack_chk_guard == r0)
    return result

__stack_chk_fail()
noreturn
