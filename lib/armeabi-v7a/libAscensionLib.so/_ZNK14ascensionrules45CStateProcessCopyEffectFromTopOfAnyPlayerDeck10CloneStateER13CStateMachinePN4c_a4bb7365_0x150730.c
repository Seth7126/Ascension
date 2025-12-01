// 函数: _ZNK14ascensionrules45CStateProcessCopyEffectFromTopOfAnyPlayerDeck10CloneStateER13CStateMachinePN4core10CWorldBaseERPcRj
// 地址: 0x150730
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

char*& r10 = arg3
*(*(arg1 + 0x24c) + 8)
int32_t r0_2 = core::CWorldBase::GetInstanceByID(arg3)
void* r0_3 = *(arg1 + 0x254)
int32_t r0_5

if (r0_3 == 0)
    r0_5 = 0
else
    *(r0_3 + 8)
    r0_5 = core::CWorldBase::GetInstanceByID(r10)

uint32_t result = *arg4
int32_t* arg_0

if (result == 0 || *arg_0 u< 0x2c4)
    uint32_t result_1 = operator new(0x2c4)
    char r8_1 = *(arg1 + 0x250)
    result = result_1
    char r9_1 = *(arg1 + 0x251)
    CGameStateOptions::CGameStateOptions(result_1.b)
    *(result + 0x24c) = r0_2
    *result = _vtable_for_ascensionrules::CStateProcessCopyEffectFromTopOfAnyPlayerDeck + 8
    *(result + 0x250) = r8_1
    *(result + 0x251) = r9_1
    *(result + 0x268) = 0
    *(result + 0x26c) = 0
    *(result + 0x270) = _vtable_for_ascension::CEventCopyHeroEffect + 8
    *(result + 0x274) = 0x17
    *(result + 0x278) = 0
    *(result + 0x2bc) = r0_2
    *(result + 0x2c0) = 0
    *(result + 0x254) = r0_5
    *(result + 0x258) = 0
    *(result + 0x25c) = 0
    *(result + 0x260) = 0
    *(result + 0x264) = 0
else
    int16_t r8 = *(arg1 + 0x250)
    CGameStateOptions::CGameStateOptions(result.b)
    *(result + 0x250) = r8
    *(result + 0x24c) = r0_2
    *result = _vtable_for_ascensionrules::CStateProcessCopyEffectFromTopOfAnyPlayerDeck + 8
    *(result + 0x268) = 0
    *(result + 0x26c) = 0
    *(result + 0x270) = _vtable_for_ascension::CEventCopyHeroEffect + 8
    *(result + 0x274) = 0x17
    *(result + 0x278) = 0
    *(result + 0x2bc) = r0_2
    *(result + 0x2c0) = 0
    *(result + 0x254) = r0_5
    *(result + 0x258) = 0
    *(result + 0x25c) = 0
    *(result + 0x260) = 0
    *(result + 0x264) = 0
    *(result + 0x2c) = 0
    *arg4 += 0x2c4
    *arg_0 -= 0x2c4

*(result + 0x28) = arg1
void* r0_17 = *(arg1 + 0x258)
int32_t r0_19

if (r0_17 == 0)
    r0_19 = 0
else
    *(r0_17 + 8)
    r0_19 = core::CWorldBase::GetInstanceByID(r10)

*(result + 0x258) = r0_19
void* r0_20 = *(arg1 + 0x25c)
int32_t r0_22

if (r0_20 == 0)
    r0_22 = 0
else
    *(r0_20 + 8)
    r0_22 = core::CWorldBase::GetInstanceByID(r10)

*(result + 0x25c) = r0_22
void* r0_23 = *(arg1 + 0x260)
int32_t r0_25

if (r0_23 == 0)
    r0_25 = 0
else
    *(r0_23 + 8)
    r0_25 = core::CWorldBase::GetInstanceByID(r10)

*(result + 0x260) = r0_25
void* r0_26 = *(arg1 + 0x264)
int32_t r0_28

if (r0_26 == 0)
    r0_28 = 0
else
    *(r0_26 + 8)
    r0_28 = core::CWorldBase::GetInstanceByID(r10)

*(result + 0x264) = r0_28
*(result + 0x268) = *(arg1 + 0x268)
void* r0_30 = *(arg1 + 0x2c0)

if (r0_30 != 0)
    *(r0_30 + 8)
    *(result + 0x2c0) = core::CWorldBase::GetInstanceByID(r10)

if (*(arg1 + 0x38) s>= 1)
    void* r2 = *(result + 0x24c)
    void* r1_12 = *(result + 0x254)
    void* r0_34 = *(r2 + 4)
    
    if (r1_12 != 0)
        r10 = *(r1_12 + 0xc)
    
    if (r1_12 == 0)
        r10 = nullptr
    
    int32_t r0_36 = *(r0_34 + 0x1c) - *(r0_34 + 0x18)
    int32_t (* const var_38)(CStateMachine&, CState*, int32_t, uint32_t*)
    void* var_34
    
    if (r0_36 s>= 1)
        int32_t i = 0
        
        do
            void* r0_37 = *(result + 0x258 + (i << 2))
            
            if (r0_37 != 0)
                void* r1_14 = *(r0_37 + 0xc)
                
                if (zx.d(*(r1_14 + 0xc9)) == 0 && r1_14 != r10 && *(r1_14 + 0x88) == 1)
                    var_34 = r0_37
                    var_38 = ascensionrules::CStateProcessCopyEffectFromTopOfAnyPlayerDeck::SelectEffectToCopy
                    CGameStateOptions::AddSimpleUserOption(result.w, *(r0_37 + 8), 0xa081, 
                        "Copy %s", var_38)
            
            i += 1
        while (i s< r0_36 s>> 2)
        
        r2 = *(result + 0x24c)
    
    (*(*result + 0x34))(result, arg2, r2, "Select Effect to Copy", var_38, var_34)

return result
